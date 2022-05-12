package class30Maps;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {
    public static void main(String[] args) {
        TreeMap<String,Person>personTreeMap=new TreeMap<>();
        personTreeMap.put("a",new Person("Dana","Grinco",25,125000));
        personTreeMap.put("b",new Person("Roman","Grinco",26,160000));
        personTreeMap.put("c",new Person("Santa","Claus",100,1000000));
        personTreeMap.put("d",new Person("Lidia","Martea",45,12000));

        for(Map.Entry<String,Person> p:personTreeMap.entrySet()){
            System.out.println(p);
        }
    }
}
