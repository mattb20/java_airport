package JAirport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
public class WeatherTest {
    private Weather weather;

    @BeforeEach
    void setUp() {
        weather = new Weather();
    }

    @Test
    public void get_weather() {
        weather.get();
    }
    @Test
    public void random_number() {
        int random_number = weather.generate_number();
        assertTrue(random_number <= 10);
    }
}