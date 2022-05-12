package class30Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListAndMaps {
    public static void main(String[] args) {
        ArrayList<String > vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("carrot");
        vegetables.add("Onion");

        ArrayList<String > fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        //as a value we store String and  ArrayList<String> is the whole list of the vegetables
        //so we store a list inside a map
        //that is nesting
        Map<String, ArrayList<String> > healthyFoods = new HashMap<>();
        healthyFoods.put("Vegetables ", vegetables);
        healthyFoods.put("Fruits ", fruits);

        System.out.println(healthyFoods);
        //console:{Vegetables =[potato, carrot, Onion], Fruits =[apple, orange, banana]}
    }
    }

