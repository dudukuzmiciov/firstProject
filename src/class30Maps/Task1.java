package class30Maps;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        /*Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map*/

        //If there are no restrictions on isertion order we use HashMap always!
        HashMap<Integer, String> building = new HashMap<>(); //keys data type- integer / values data type-String
        building.put(1, "google");
        building.put(2, "Syntax");
        building.put(3, "Apple");
        building.put(4, "BestBuy");
        building.put(5, "Amazon");
        building.put(6, "Facebook");
        building.put(7, "Verizon");
        System.out.println(building.size());
        System.out.println(building
        );
        System.out.println("------------");

        building.replace(4, "Fios"); //update the value
        System.out.println(building);

        System.out.println("------------");

        building.remove(7, "Verizon");
        System.out.println(building);
    }

    }
