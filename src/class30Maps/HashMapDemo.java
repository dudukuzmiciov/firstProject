package class30Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 10.0);
        fruit.put("Orange", 15.0);

        HashMap<String, Double> vegetables = new HashMap<>();
        vegetables.put("onion", 12.5);
        vegetables.put("Carrot", 10.6);
        ArrayList<HashMap<String, Double>> list = new ArrayList<>();
        list.add(fruit);
        list.add(vegetables);
        System.out.println(list);
        //console: [{Apple=10.0, Orange=15.0}, {Carrot=10.6, onion=12.5}]
    }
}
