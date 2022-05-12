package review13;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterrator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Orsan");
        names.add("Nasir");
        names.add("Mujeeb");
        names.add("Tolganus");

        names.removeIf(s -> s.length() > 5);
        System.out.println(names);
        //  Iterator<String> iterator=names.iterator();
        //   while (iterator.hasNext()){
        //     if (iterator.next().length()>5){
        //      iterator.remove();
        //   }
        //  }
        //   System.out.println(names);


        ListIterator<String> stringListInterator= names.listIterator();
        while(stringListInterator.hasNext()){
            String name =(String) stringListInterator.next();
            stringListInterator.add("Zulfiya");
        }
        System.out.println(names);
    }
}
