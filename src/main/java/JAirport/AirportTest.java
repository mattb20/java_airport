package JAirport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {
    @Test
    public void has_storage(){
        Airport airport = new Airport();
        String storage[] = {"plane"};
        String airport_storage[] = airport.storage();
        assertArrayEquals(storage, airport_storage);

    }
    @Test
    public void takeoff() {
        Airport airport = new Airport();
        String storage[] = {"plane"};
        airport.takeoff(storage);
    }




}