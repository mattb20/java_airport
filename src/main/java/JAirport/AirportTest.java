package JAirport;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {
    private Airport airport;
    @BeforeEach
    public void setUp() {
        airport = new Airport();
    }
    @Test
    public void has_storage(){
        ArrayList<String> test_storage = new ArrayList<String>();
        ArrayList<String> actual_storage;
        actual_storage = airport.storage();
        assertEquals(test_storage, actual_storage);

    }
    @Test
    public void takeoff() {
        ArrayList<String> airport_storage = new ArrayList<String>();
        airport_storage.add("plane");
        ArrayList<String> empty_hanger = airport.takeoff(airport_storage);
        assertEquals(0, empty_hanger.size());

    }
    @Test
    public void landing() {
        String plane = "plane";
        airport.land_plane(plane);
        assertEquals(1, airport.hanger.size());

    }
    @Test
    public void alertwhenfull() {
        int capacity = 4;
        airport.land_plane("plane");
        airport.land_plane("plane");
        airport.land_plane("plane");
        airport.land_plane("plane");
        assertThrows(RuntimeException.class, () -> airport.land_plane("plane"));
        }
       @Test
    public void has_weather() {
        assertTrue(airport.condition == "stormy" || airport.condition == "clear");
       }
       @Test
    public void refuse_landing_when_stormy() {
        airport.condition = "stormy";
        assertThrows(RuntimeException.class, () -> airport.land_plane("plane"));
       }
}