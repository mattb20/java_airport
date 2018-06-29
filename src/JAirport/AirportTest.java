package JAirport;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    public void has_storage(){
        Airport airport = new Airport();
        String storage[] = {"plane"};
        String airport_storage[] = airport.storage();
        assertArrayEquals(storage, airport_storage);

    }



}