package Replits;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Reepl209 {
    public static void main(String[] args) {
// create array list to store maps inside
        List<Map<String, Object>> dataList = new ArrayList<>();

// create first map: apple
        LinkedHashMap<String, Object> appleMap = new LinkedHashMap<>();
// add keys and values in apple map
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);
// add apple map to array list
        dataList.add(appleMap);
// create second map : orange
        LinkedHashMap<String, Object> orangeMap = new LinkedHashMap<>();
//add keys and values in orange map
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);
// add orange map to array list
        dataList.add(orangeMap);
// declare variable totalPurchase with default value
        double totalPurchase =0;
// open "for each" loop to iterate through maps inside list(this loop will take each map one by one)
        for(Map<String,Object> map :dataList){
            String items = (String) map.get("Items");      // using .get method, retrieve value using key "Items" and cast it from object into string
            Double price = (Double) map.get("Price");      //  same here but cast value into double because now have number
            Integer quant = (Integer) map.get("Quantity");   // casting again into integer. see picture
// calculate subtotal by multiply casted price and quantity
            Double subtotal =price*quant;
// now need to have dynamic calculation of totalPurchase by doing next: totalPurchase= totalPurchase+subtotal. lets write it using short operator
            totalPurchase+=subtotal;
//final step inside for each loop is to print requested line wil all info except for totalPurchase
            System.out.println("Items: "+items+ " Price: "+price+" Quantity: "+(double)quant+" SubTotal: "+subtotal);
        }

// after loop through all maps, value of totalPurchase will be calculated. just print it
        System.out.println("Your Purchase total :"+totalPurchase);

    }


}
