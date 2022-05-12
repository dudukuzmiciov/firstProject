package class30Maps;

import java.util.HashSet;
import java.util.Set;

public class EntrySetDemo {
    String key;
    Double value;

    public EntrySetDemo(String key, Double value) {
        this.key = key;
        this.value = value;
    }
    String getKey(){
        return key;
    }
    Double getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "B12Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
class Test{



    public static void main(String[] args) {
        Set<EntrySetDemo> entries=new HashSet<>();
        entries.add(new EntrySetDemo("Apple",12.0));
        entries.add(new EntrySetDemo("Mango",15.0));
        entries.add(new EntrySetDemo("Banana",18.0));
        entries.add(new EntrySetDemo("Kiwi",12.0));
        System.out.println(entries);
        for (EntrySetDemo b:entries){
            System.out.println(b);
            System.out.println(b.getKey());
            System.out.println(b.getValue());
        }

    }
}
