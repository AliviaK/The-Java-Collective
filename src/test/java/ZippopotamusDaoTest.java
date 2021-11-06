
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



// this wont compile.  I need to add the actual DAO and classes to support the data (robopojo + jason stuff)
// but im not able to build out directories / they seem to not push when I commit
//adding this file to attempt to push dir structure up **also begining of test class



public class ZippopotamusDaoTest {
    @Test
    public void testZipApi() throws Exception {
        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();

        ZipCode zc = zippoDAO.GetCityState("53589");

        String cityFromApi = zc.getPlaces().get(0).getPlaceName();


        String state = zc.getPlaces().get(0).getState();

        assertEquals("Stoughton",cityFromApi);
        assertEquals("Wisconsin", state);


        //assertEquals("???", response);
    }


}
