package JAirport;


import java.util.ArrayList;
import java.util.Arrays;
import JAirport.Weather;
public class Airport {
    ArrayList<String> hanger = new ArrayList<String>();
    public ArrayList<String> storage() {
        return hanger;
    }
    public ArrayList<String> takeoff(ArrayList<String> airport_storage){
        airport_storage.remove(airport_storage.size() - 1);
        return airport_storage;

    }
    public ArrayList<String> land_plane(String plane) {
        hanger.add(plane);
        return hanger;
    }
}
