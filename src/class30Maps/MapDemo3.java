package class30Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 150.5);
        fruitMap.put("Mango", 22.0);
        fruitMap.put("Orange", 12.5);

        //Get the values from this map:
        Collection<Double> values= fruitMap.values();
        System.out.println(values);

        //remove all the values which are greater than or equal to 20:
        Iterator<Double> iterator = values.iterator();
        while(iterator.hasNext()){ //method inside the iterator that says if there are still elements it will return true.
            if(iterator.next()>=20){ //autocasting is done
                iterator.remove();
            }
        }
        System.out.println(fruitMap);


    }
}
