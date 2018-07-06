package JAirport;

import java.util.ArrayList;
import java.util.Random;

public class Weather {
    public String get() {
        String weather = generate_number() < 2 ? "stormy" : "clear";
        return weather;
    }

    public int generate_number() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random generator = new Random();
        int index = generator.nextInt(numbers.length);
        return numbers[index];

    }
}




