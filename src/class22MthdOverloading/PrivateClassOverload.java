package class22MthdOverloading;

public class PrivateClassOverload {
    /*create a class with private method that has 3 overloaded forms.
    then call each overloaded method with specific arguments and observe the  result
     */
    private static void method(boolean bol) { //private class method that can be accessed only in that class but can be
       // called without creating an obj
        System.out.println("1");
    }

    private static void method(int num) {
        System.out.println("2");
    }

    private static void method(String name) {
        System.out.println("3");

    }
    public static void main(String[] args) {
        method(true);
        method(15);
    }
}
