package class30Maps;

import java.util.LinkedHashSet;

public class HW2Collections {
    /*//Create the collection that will store single unique Objects of a String type
    // in which order is preserved.
    //Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {
        //which data structure can store unique values?- Sets are smth that always store unique values
        LinkedHashSet<String> drinks= new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Vodka");
        drinks.add("tequila");
        drinks.add("margarita");
        drinks.add("Link");
        //concatinate the values
        //declare a string:
        StringBuilder allDrinks= new StringBuilder();
        //loop through the sets:
        for(String drink:drinks){
            allDrinks.append(drink); //if you want space between the words in console(drink).append(" "
        }
        System.out.println(allDrinks);
        //console: CokeVodkatequilamargaritaLink
    }
}
