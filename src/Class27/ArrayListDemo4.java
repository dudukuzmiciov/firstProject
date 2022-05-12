package Class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("onion");
        vegetables.add("carrot");

        //add all elements in one list:
        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("apple");
        itemsToBeRemoved.add("onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);



    }
}
