package JAirport;


import java.util.ArrayList;

public class Airport {

    ArrayList<String> hanger = new ArrayList<String>();
    Weather weather = new Weather();
    String condition = weather.conditions;
    int capacity = 4;

    public ArrayList<String> storage() {
        return hanger;
    }
    public ArrayList<String> takeoff(ArrayList<String> airport_storage){
        airport_storage.remove(airport_storage.size() - 1);
        return airport_storage;

    }
    public ArrayList<String> land_plane(String plane) {
        if(hanger.size() < capacity && condition == "clear") {
            hanger.add(plane);
            return hanger;
        } else {
            throw new java.lang.RuntimeException("Airport storage full!");
        }

    }

}
