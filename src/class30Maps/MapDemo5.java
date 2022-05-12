package class30Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {

        HashMap<String, Double> fruitMap = new HashMap<>();
//fruitMap.put("Apple",20); auto casting does not work in collections and maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 20.0);

        System.out.println(fruitMap.keySet()); //get keys
        System.out.println(fruitMap.values()); //get value
        System.out.println(fruitMap.entrySet());//getKeys and the values
        Iterator<Map.Entry<String,Double>> iterator = fruitMap.entrySet().iterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next()); //all values combined together inside iterator.next()
            System.out.println(iterator.next().getValue());
        }
    }
}
