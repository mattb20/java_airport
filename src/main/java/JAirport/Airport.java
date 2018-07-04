package JAirport;


import java.util.ArrayList;
import java.util.Arrays;

public class Airport {
    public static ArrayList<String> storage() {
        ArrayList<String> hanger = new ArrayList<String>();
        hanger.add("plane");
        return (hanger);
    }
    public static ArrayList<String> takeoff(ArrayList<String> airport_storage){
        airport_storage.remove(airport_storage.size() - 1);
        return airport_storage;

    }
}
