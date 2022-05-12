package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratot {
    public static void main(String[] args) {
        /*create an arraylist of words.
        Remove every word that ends with "e"
         */

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Love");
        arrayList.add("lahore");
        arrayList.add("cake");

        //The shorter way provided by java instead while loop line22
        arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));
        System.out.println(arrayList);

        /*while(iterator.hasNext()){
            if(iterator.next().toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(arrayList);*/
    }
}
