package class16StringAndStringBiolder;

public class Task3 {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        //String class method to count the number of characters in a class
        System.out.println(a.length());
        // length property that we can use to check the number of elements in a array
        System.out.println(a.split("[?.!]").length); //so length it's a property used for arrays that throws the
        // numbers of the elements inside an array the number to count length()is a method that tells the numbers of
        // characters inside string class

        //FOR EXAMPLE in this method we cant use length() we need length, which is a property of arrays
        int[] arr={10,10};
        System.out.println(arr.length);

        Task3 task3=new Task3();
        System.out.println(task3.method(arr).length);
    }


    String [] method(int [] numbers){
        String [] stringArr=new String[numbers.length];
        return stringArr;
    }
}
