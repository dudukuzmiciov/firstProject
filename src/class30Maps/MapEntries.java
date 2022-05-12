package class30Maps;

import java.util.HashMap;
import java.util.Map;

public class MapEntries {
    public static void main(String[] args) {
            HashMap<String, Double> fruitMap = new HashMap<>();
            fruitMap.put("Apple", 20.0);
            fruitMap.put("Banana", 10.2);
            fruitMap.put("Kiwi", 150.5);
            fruitMap.put("Mango", 22.0);
            fruitMap.put("Orange", 12.5);

            //entry.Set is a box inside we have boxes with keys and values
        System.out.println(fruitMap.entrySet()); //method that combines keys and values as a single entity
        /* getting the entries that contains keys and values together: */
        for(Map.Entry<String,Double> entry : fruitMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        }
    }

