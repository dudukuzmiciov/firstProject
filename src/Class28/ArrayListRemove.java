package Class28;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        //create an arrayList of drinks.
        //if any drink has letter "a" ot "e" replace it with water
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("coke");
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("milk");

        for (int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
