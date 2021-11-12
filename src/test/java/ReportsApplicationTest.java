import Zippopotamus.API.StateCity;
import Zippopotamus.API.ZipCode;
import edu.matc.controller.ReportsApplication;
import edu.matc.entity.Reports;
import edu.matc.persistence.ZippopotamusDAO;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;





public class ReportsApplicationTest {

    @Test
    public void testProcessZipCode() throws Exception {
        ReportsApplication ra = new ReportsApplication();
        List<Integer> years = Arrays.asList(2020,2019,2018);
        List<Reports> reports = ra.processZipCode(53589,years);

        assertEquals(3, reports.size());
        assertEquals("?", reports.get(0).getYear());
        //assertEquals(2018, reports.get(2).getYear());
    }



}
