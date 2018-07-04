package JAirport;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {
    @Test
    public void has_storage(){
        Airport airport = new Airport();
        ArrayList<String> storage = new ArrayList<String>();
        storage.add("plane");
        ArrayList<String> hanger = airport.storage();
        assertEquals(storage, hanger);

    }
    @Test
    public void takeoff() {
        Airport airport = new Airport();
        ArrayList<String> plane_storage = new ArrayList<String>();
        plane_storage.add("plane");
        ArrayList<String> empty_hanger = airport.takeoff(plane_storage);
        assertEquals(empty_hanger.size(), 0);

    }




}