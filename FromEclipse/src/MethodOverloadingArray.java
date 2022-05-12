public class MethodOverloadingArray {
    public static void main(String[] args) {
        add(10);
        add(10, 10);
        add(10, 20, 30, 675);
    }

    /*static void add(int num1, int num2){
    System.out.println(num1+num2);
}
     static void add(int num1,int num2, int num3){
     System.out.println(num1+num2+num3);
     */

    //THIS METHOD IS INSTEAD OF WRITING  MANY METHODS:

    static void add(int... numArray) { //numArray: [10,10] (...)is the syntax of the parameters that were converted to arrays
        int sum = 0; //sum=20
        for (int num : numArray) { //numArray : [10,10]
            sum = sum + sum;

        }
        System.out.println(sum);
    }
}