package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        /*create an arrayList of even numbers from 1 to 500.
        remove any number that is divisible by 5 from that arrayList
         */
        ArrayList<Integer> number=new ArrayList<>();
        for (int i=0;i<=500;i++){
            number.add(i);
        }
        //lamda expression instead of while loop:
        number.removeIf(integer -> integer % 5 == 0);
        /*Iterator<Integer> iterator = number.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();*/
    }
}
