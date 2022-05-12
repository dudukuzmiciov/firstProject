package review13;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {
    public static void main(String[] args) {
        String[] names=new String[100];
        names[0]="Maha";
        System.out.println(Arrays.toString(names));

        ArrayList<String> arrayList= ArrayUtil.toArrayList(names);

        arrayList.add("Emilia");
        System.out.println(arrayList);
    }
}
