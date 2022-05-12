package class30Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        /*create a map of best buy store.
        place item id and item name into it. (example(7664847=Printer, 7879885=TV etc)
        retrieve all keys and values from a best buy map using entrySet.
         */

        HashMap<Integer,String> bestBuy= new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(78798895,"Camera");
        bestBuy.put(7879885,"TV");

        Iterator<Map.Entry<Integer,String>> iterator=bestBuy.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
