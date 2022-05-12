package class22MthdOverloading;

public class OverloadStaticMethod {
    /*create a class with static method that has 3 overloaded forms.
    then call each overloaded method with specific arguments and observe result
     */

    public static void method(boolean bol) { //instead of main-method
        System.out.println("1");
    }

    public static void method(int num) {
        System.out.println("2");
    }

    public static void method(String name) {
        System.out.println("3");

    }
    public static void main(String[] args) {
        method(true);
        method(15);
    }

    }
