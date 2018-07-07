package JAirport;


import java.util.ArrayList;
import java.util.Arrays;
import JAirport.Weather;
public class Airport {
    ArrayList<String> hanger = new ArrayList<String>();
    Weather weather = new Weather();
    int capacity = 4;
    public ArrayList<String> storage() {
        return hanger;
    }
    public ArrayList<String> takeoff(ArrayList<String> airport_storage){
        airport_storage.remove(airport_storage.size() - 1);
        return airport_storage;

    }
    public ArrayList<String> land_plane(String plane) {
        if(hanger.size() < capacity) {
            hanger.add(plane);
            return hanger;
        } else {
            throw new java.lang.RuntimeException("Airport storage full!");
        }

    }

}
