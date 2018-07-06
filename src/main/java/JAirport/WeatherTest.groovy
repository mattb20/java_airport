package JAirport

import org.junit.jupiter.api.BeforeEach

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest extends GroovyTestCase {
    private Weather weather;
    @BeforeEach
    void setUp() {
        weather = new Weather();
    }
}
