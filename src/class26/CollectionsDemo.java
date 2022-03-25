package class26;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {
    public static void main(String[] args) {

        String name = "Yazgul";
        String name2 = "Farah";

        //Not scalable if we have to share large amount of data
        //Arrays can be good option to tackle this problem

        String[] names = {"Yazgul", "Andrew"};
        //name[2]="Teyfur"; can not
        String[] names2 = new String[1000];
        names2[0] = "Elena";
        names2[2] = "Andrew";
        System.out.println(Arrays.toString(names2));

        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList=> Name of the class
        //<> diamond operator
        //String datatype

        syntaxStudents.add("Dmitriy");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Andrew");
        System.out.println(syntaxStudents); //so this line  prints line24

    }
}