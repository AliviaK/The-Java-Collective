import Zippopotamus.API.StateCity;
import Zippopotamus.API.ZipCode;
import edu.matc.controller.ReportsApplication;
import edu.matc.entity.*;
import edu.matc.persistence.ZippopotamusDAO;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;





public class ReportsApplicationTest {

    @Test
    public void testProcessZipCode() throws Exception {
        ProcessReports pr = new ProcessReports();
        List<Integer> years = Arrays.asList(2020,2019,2018);

        //not used, but does work with a single item array
        //List<Integer> years = Arrays.asList(2020);

        List<Reports> reports = pr.processZipCode(53589,years);

        assertEquals(3, reports.size());
        assertEquals(2020, reports.get(0).getYear());
        assertEquals(2019, reports.get(1).getYear());
        assertEquals(2018, reports.get(2).getYear());

    }

    @Test
    public void testProcessZipCodeWithoutYear() throws Exception {
        ProcessReports pr = new ProcessReports();

        //not used, but does work with a single item array
        //List<Integer> years = Arrays.asList(2020);

        List<Reports> reports = pr.processZipCode(53593);

        assertEquals(1, reports.size());
        assertEquals(2020, reports.get(0).getYear());

    }

    @Test
    public void testProcessStateCity() throws Exception {
        ProcessReports pr = new ProcessReports();
        List<Integer> years = Arrays.asList(2020,2019,2018);

        //not used, but does work with a single item array
        //List<Integer> years = Arrays.asList(2020);

        List<Reports> reports = pr.processStateCity("wi","beloit",years);

        //this city returns 2 zips.  we are sending 3 years so
        //that is total of 6 reports
        assertEquals(6, reports.size());

    }

}
