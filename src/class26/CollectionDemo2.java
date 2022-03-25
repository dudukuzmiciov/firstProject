package class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries =new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("GANA");
        countries.add("Moldova");
        System.out.println(countries.get(3));//array index 3
       // System.out.println(countries.get(8)); error-out of bound
        //System.out.println(countries.get(-1)); error-out of bound
        System.out.println(countries);

        countries.add(3,"Pakistan"); // change the previous
        //country from array index 3 with this new country pakistan
        //see the console
        System.out.println(countries);
        System.out.println(countries.size()); //specify how many elements are present
        //in the arrayList
        //System.out.println(countries.length()); cant use length in array list

        countries.remove("Pakistan");//build in method to remove the elements
        countries.add("Pakistan");
        countries.clear();//removes all
        System.out.println(countries);
        System.out.println(countries.size());

    }
}
