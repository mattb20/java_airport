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
        System.out.println("Set up was called...");
    }
    @Test
    public void has_storage(){
        System.out.println("inside 1st test...");
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
}