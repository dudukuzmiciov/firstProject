package Class27;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("apple");
        groceries.add("orange");
        groceries.add("potato");
        groceries.add("onion");
        groceries.add("carrot");
        System.out.println(groceries);

        //containsAll check if the list contains the specified value:
        ArrayList<String> list2=new ArrayList<>();
        list2.add("apple");
        list2.add("onion");
        //list2.add("pillow"); -> this will give us a false as the list doesnt contain such item

        System.out.println(groceries.containsAll(list2));
    }
}
