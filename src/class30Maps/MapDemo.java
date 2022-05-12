package class30Maps;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();

       // fruitMap.put("Apple",20); auto casting doesnt work in collections and maps

       /* The put() method of Dictionary is used to insert a mapping into the dictionary.
        This means a specific key along with the value can be mapped into a particular dictionary.*/
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",15.5);
        fruitMap.put("Mango",22.0);
        fruitMap.put("Banana",12.5);//dublicate values are overwritten, this will be printed not line 10,takes last value
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi")); //case sensitive, cant use ignoreCase method
        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi")); //true
        System.out.println(fruitMap.containsKey("Camel")); //false
        System.out.println(fruitMap.containsValue(20.0)); //true
        System.out.println(fruitMap.isEmpty()); //false
        System.out.println(fruitMap.size()); //3
        fruitMap.replace("Banana",50.0);
        System.out.println(fruitMap);
        //we cant replace the key, only remove it and insert another one instead
    }
}
