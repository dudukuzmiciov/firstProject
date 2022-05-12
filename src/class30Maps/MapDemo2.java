package class30Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 15.5);
        fruitMap.put("Mango", 22.0);
        fruitMap.put("Orange", 12.5);
        //we cant remove from a map, we have to insert it in a set first

        Set<String> keys = fruitMap.keySet(); //returns a set , now all the keys from that map are converted to a set
        System.out.println(keys);

        //get an iterator from a set:
        Iterator<String> iterator = keys.iterator();

        //Remove all fruits from the map that contains letter "e"
        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);

    }
}
