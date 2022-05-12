package class30Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListDemo {
    public static void main(String[] args) {
        //ENTRY SET - GIVES US THE KEYS AND THE VALUES
        int[] arr={10,20,30};
        int[] arr2 = new int[5];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;

        List<Integer> list= Arrays.asList(10,20,30); //wasting memory with this method
        System.out.println(list);
        //list.add(40); we can not call methods from the collection class
        //it is not supported if we create lists using Arrays.asList

        List<Integer> list2= new ArrayList<>(Arrays.asList(10,20,30));
        list2.add(40);
        System.out.println(list2);
    }
}
