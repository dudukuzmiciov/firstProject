package Class28;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HW2 {
    public static void main(String[] args) {

    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Los Angeles");
        cities.add("San Francisco");
        cities.add("New York");
        cities.add("Miami");
        cities.add("Atlanta");
        cities.add("Walnut Creek");
        cities.add("Arlington");
        cities.add("Oakland");
        cities.add("Boston");
        System.out.println(cities);

        //Lambda method: if you write  the iterator code intellij will suggest this method as easier, just import.
        cities.removeIf(s ->s.startsWith("A"));
        System.out.println(cities);

        //Using the iterator method:
        //Iterator<String> iterator =cities.iterator();
        //while(iterator.hasNext()){
           // if(iterator.next().startsWith("A")){
               // iterator.remove();
           //  }
       // }
      //  System.out.println(cities);
    }
}


