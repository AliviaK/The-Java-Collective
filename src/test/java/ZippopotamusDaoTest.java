
import Zippopotamus.API.StateCity;
import Zippopotamus.API.ZipCode;
import edu.matc.persistence.ZippopotamusDAO;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class ZippopotamusDaoTest {
    @Test
    public void testZipApi() throws Exception {
        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();
        ZipCode zc = zippoDAO.GetCityState("94608");
        //the city name is located in the placesItem.  since each zip has only one city,
        //it will always be first item in the list (0)
        String cityFromApi = zc.getPlaces().get(0).getPlaceName();
        String state = zc.getPlaces().get(0).getState();

        assertEquals("Stoughton",cityFromApi);
        assertEquals("Wisconsin", state);
    }


    @Test
    public void testStateCityApi() throws Exception {
        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();
        StateCity rc = zippoDAO.GetZipCodes("wi","beloit");
        // this city returns two zip codes.  we grab both and also verity
        //only two were returned
        String zipOneFromAPI = rc.getPlaces().get(0).getPostCode();
        String zipTwoFromAPI = rc.getPlaces().get(1).getPostCode();
        int numZipsReturned = rc.getPlaces().size();


        assertEquals(2,numZipsReturned);
        assertEquals("53511", zipOneFromAPI);
        assertEquals("53512", zipTwoFromAPI);
    }


}
