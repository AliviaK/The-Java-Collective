package edu.matc.persistence;
import edu.matc.entity.IncomeData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * This class is used to access the IncomeData from the database.
 * @author John Oliver
 */
public class IncomeDataDAO {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /** Gets income data based on the zip code.
     *
     * @param zip zip code
     * @return Income data based on zip code
     */
    public List<IncomeData> getIncomeDataByZip(int zip) {
        List<IncomeData> incomeData = null;
        final String columnName = "zip_code";

        try (Session session = sessionFactory.openSession();){

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<IncomeData> query = builder.createQuery(IncomeData.class);

            Root<IncomeData> root = query.from(IncomeData.class);
            query.select(root).where(builder.equal(root.get(columnName),zip));
            incomeData = session.createQuery(query).getResultList();
        } catch (HibernateException he) {
            logger.catching(he);
        } catch (Exception ex) {
            logger.catching(ex);
        }
        return incomeData;
    }

}
