package class16StringAndStringBiolder;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Task4 {
    public static void main(String[] args) {
        /*
        get the words from the syntax
        reverse the words
        append the words to get the sentence back

        //The easiest way to reverse:
        StringBuilder stringBuilder=new StringBuilder("Sunday is great");
        System.out.println(stringBuilder.reverse()); //console - taerg si yadnuS

        //OR CONVERT STRING TO STRINGBUILDER:
        String s1="Sunday is great";
        StringBuilder str=new StringBuilder(s1);//here string s gets converted
        str.reverse();
        s1=str.toString();
        System.out.println(s1); //BUT THIS TWO METHODS WILL NOT REVERS THE STRING BACK TO ITS ORIGINAL SO: */

        //USE a loop:

        String s="Sunday is great";

        Task4 task4=new Task4();
        // System.out.println(task4.reverseString(s));
        String [] strArray=s.split(" ");
        //System.out.println(strArray[0]);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(task4.reverseString(strArray[i])+" ");

        }
        System.out.println();
        System.out.println(s);

    }
    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}

