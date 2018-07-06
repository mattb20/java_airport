package JAirport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
class WeatherStub extends Weather {
    @Override
    public int generate_number() {
        return 1;
    }

}
public class WeatherTest {
    private Weather weather;
    @BeforeEach
    void setUp() {
        weather = new Weather();
    }
    @Test
    public void get_weather() {
        String generated_weather = weather.get();
        assertTrue(generated_weather == "stormy" || generated_weather == "clear");
    }
    @Test
    public void random_number() {
        int random_number = weather.generate_number();
        assertTrue(random_number <= 10);
    }
}
