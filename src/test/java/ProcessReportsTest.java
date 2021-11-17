import edu.matc.controller.ProcessReports;
import edu.matc.entity.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * The type Process reports test.
 */
public class ProcessReportsTest {

    /**
     * Test process zip code.
     *
     * @throws Exception the exception
     */
    @Test
    public void testProcessZipCode() throws Exception {
        ProcessReports pr = new ProcessReports();
        int year = 2019;

        //not used, but does work with a single item array
        //List<Integer> years = Arrays.asList(2020);

        List<Reports> reports = pr.processZipCode(53512,year);

        assertEquals(1, reports.size());
        assertEquals(2019, reports.get(0).getYear());


    }


    /**
     * Test process state city.
     *
     * @throws Exception the exception
     */
    @Test
    public void testProcessStateCity() throws Exception {
        ProcessReports pr = new ProcessReports();
        int year = 2019;

        //not used, but does work with a single item array
        //List<Integer> years = Arrays.asList(2020);

        List<Reports> reports = pr.processStateCity("wi","beloit",year);

        //this city returns 2 zips.  we are sending 3 years so
        //that is total of 2 reports
        assertEquals(2, reports.size());

    }

}
