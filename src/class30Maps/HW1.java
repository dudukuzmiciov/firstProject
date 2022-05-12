package class30Maps;

import java.util.HashMap;
import java.util.Map;

public class HW1 {
    /*Create a Map that will store Employee name and salary. Write a logic to retrieve
   an employee who gets the highest salary. Output should be in the below format:
  John Smith=$1000008*/
    public static void main(String[] args) {
        HashMap<String,Integer> employee=new HashMap<>();
        employee.put("Samina",150000);
        employee.put("Sayed",154000);
        employee.put("Nazgul",160000);
        employee.put("Mujeeb",170000);
        //declare a variable that holds the name of the employee  who holds the max:
        String name=null;
        Integer salary=0; //here we assume that this is the maximum entry
       //getting all entries one by one from the entry set (hashMap) and compare the value
        //we stored inside the atributes to those null/zero string and integer:
        for(Map.Entry<String,Integer> entry:employee.entrySet()){
            //iterating through the values:
            if(entry.getValue()>salary){ //if getValue() the value is greater that the salary we already inserted
                salary=entry.getValue();//store the value
                name=entry.getKey(); //and update the name
            }
        }
        System.out.println(name+" = $"+salary);
        //Mujeeb = $170000 - console
    }
}

