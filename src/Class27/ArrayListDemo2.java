package Class27;

import java.util.ArrayList;

public class ArrayListDemo2 {
    //array list that will store double value
    public static void main(String[] args) {
        ArrayList<Double> number=new ArrayList();
        //add some numbers to this list:
        number.add(10.5);
        number.add(100.5);
        number.add(12.9);
        number.add(1.5);

        //i want to get 12.9 value:
        System.out.println(number.get(2)); //(2) - array index 2 is line10 (third value)

        //remove 12.9 value from this list:
        number.remove(2); //remove index 2 from the list

        //print all the elements from this array list:
        System.out.println(number);

        //check how many elements inside the arrayList
        System.out.println(number.size());

        //loop throught the elements to print them all out:
        for(Double numbers:number){
            System.out.println(numbers);

        }
    }
}
