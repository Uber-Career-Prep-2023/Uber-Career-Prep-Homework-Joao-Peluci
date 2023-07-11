import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q6RoadNetworks {
    public static class TupleCity {
        String city_1;
        String city_2;

        TupleCity(){};

        TupleCity(String c1, String c2) {
            this.city_1 = c1;
            this.city_2 = c2;
        }
    }
    
    /*
     * In some states, it is not possible to drive between any two towns because
     * they are not connected to the same road network. Given a list of towns and a
     * list of pairs representing roads between towns, return the number of road
     * networks. (For example, a state in which all towns are connected by roads has
     * 1 road network, and a state in which none of the towns are connected by roads
     * has 0 road networks.)
     */

    public static int numNetworks(String[] towns, TupleCity[] tuple) {
        Map<String,List<String>> map = new HashMap<>();
        for (String town : towns) {
            map.put(town, null);
        }
        //For this program, what we'll do is
        //Fill up an hashmap and store all towns we have
        //Then we'll add up all the tuples into the hashmap checking by key and value (inserting in both lines of map)
        for (TupleCity tupleCity : tuple) {
            List<String> cities1 = map.get(tupleCity.city_1);
            List<String> cities2 = map.get(tupleCity.city_2);
            System.out.println();
            cities1.add(tupleCity.city_2);
            cities2.add(tupleCity.city_1);
            map.put(tupleCity.city_1, cities1);
            map.put(tupleCity.city_1, cities2);
        }
        System.out.println(map.entrySet());
        
        //Then, we'll need to use a queue to visit our nodes in order and look 

        return 0;
    }

    public static void main(String[] args) {
        String[] list_towns = {"Skagway", "Juneau", "Gustavus", "Homer", "Port Alsworth", "Glacier Bay", "Fairbanks", "McCarthy", "Copper Center", "Healy"}; 
        TupleCity[] list_tuples = {
        new TupleCity("Anchorage", "Homer"),
        new TupleCity("Glacier Bay", "Gustavus"),
        new TupleCity("Copper Center", "McCarthy"),
        new TupleCity("Anchorage", "Copper Center"),
        new TupleCity("Copper Center", "Fairbanks"),
        new TupleCity("Healy", "Fairbanks"),
        new TupleCity("Healy", "Anchorage")};
        numNetworks(list_towns, list_tuples);
    }
}