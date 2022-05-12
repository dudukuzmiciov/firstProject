package class30Maps;

import java.util.ArrayList;

public class HW3CollectionDublicates {
    /*Create a collection of integers in which you can keep duplicates. (LinkedList and Array list stores dublicate but
    Array list is faster for retrieval)
     Write a logic to find sum of all integers8*/
    public static void main(String[] args) {
        //ArrayList is good for retrival :
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        int sum=0;
        for(int i=0;i<numbers.size();i++){
            sum+=numbers.get(i); //+= is used for addition and concatenation is done in case of String.
        }
        System.out.println(sum);
        //console: 50
    }
}
