package edu.matc.persistence;
import edu.matc.entity.IncomeData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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
    public List<IncomeData> getIncomeData(String zip) {
        List<IncomeData> incomeData = null;
        final String columnName = "zipCode";

        try (Session session = sessionFactory.openSession();){

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<IncomeData> query = builder.createQuery(IncomeData.class);

            Root<IncomeData> root = query.from(IncomeData.class);
            query.select(root).where(builder.equal(root.get(columnName),zip));
            incomeData = session.createQuery(query).getResultList();
        } catch (HibernateException he) {
            logger.debug("Hibernate exception thrown in getIncome by zip only");
            logger.catching(he);
        } catch (Exception ex) {
            logger.catching(ex);
        }
        return incomeData;
    }

    /** Get income data by year and zip code.
     *
     * @param zip Zip Code
     * @param year Year to retrieve
     * @return IncomeData
     */
    public List<IncomeData> getIncomeData(String zip, int year) {
        logger.debug("Get income by zip and year. YEAR: " + year + " ZIP: " + zip);
        List<IncomeData> incomeData = null;
        final String zipColumn = "zipCode";
        final String yearColumn = "year";

        try (Session session = sessionFactory.openSession();){

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<IncomeData> query = builder.createQuery(IncomeData.class);

            Root<IncomeData> root = query.from(IncomeData.class);

            query.select(root).where(
                    builder.and(
                            builder.equal(root.get(zipColumn),zip),
                            builder.equal(root.get(yearColumn),year)
                    ));
            incomeData = session.createQuery(query).getResultList();

        } catch (HibernateException he) {
            logger.debug("Hibernate exception thrown in getIncome with zip and year");
            logger.catching(he);
        } catch (Exception ex) {
            logger.catching(ex);
        }
        return incomeData;
    }

//    /** This method take a List of zip codes and years and gets all years for all zip codes.
//     *
//     * @param zips Zip Codes
//     * @param years Years
//     * @return Income data matching all supplied zip codes and years.
//     */
//    public List<IncomeData> getIncomeData(List<Integer> zips, List<Integer> years) {
//
//        List<IncomeData> incomeData = null;
//        final String zipColumn = "zipCode";
//        final String yearColumn = "year";
//
//        try (Session session = sessionFactory.openSession();){
//
//            CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery<IncomeData> query = builder.createQuery(IncomeData.class);
//
//            Root<IncomeData> root = query.from(IncomeData.class);
//
//            List<Predicate> predicates = new ArrayList<>();
//
//            builder.disjunction();
//
//            for (Integer zip : zips) {
//                for (Integer year : years) {
//                    predicates.add(builder.equal(root.get(yearColumn), year));
//                    predicates.add(builder.equal(root.get(zipColumn), zip));
//                    builder.disjunction();
//                }
//            }
//            query.select(root).where(predicates.toArray(new Predicate[]{}));
//            query.orderBy(builder.asc(root.get(yearColumn)),builder.asc(root.get(zipColumn)));
//            incomeData = session.createQuery(query).getResultList();
//
//        } catch (HibernateException he) {
//            logger.debug("Hibernate exception thrown in getIncome with zip and year");
//            logger.catching(he);
//        } catch (Exception ex) {
//            logger.catching(ex);
//        }
//        return incomeData;
//    }

}
