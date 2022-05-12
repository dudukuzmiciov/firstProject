public class girls {
    public static void main(String[] args) {

        // 1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
        // without a temporary variable?
        //swap numbers

        //WITH temporary variable way:
        int a = 10;
        int b = 20;
        int temp = a;
        //System.out.println(temp);
        a = b;
        System.out.println(a);
        b = temp;
        System.out.println(b);


        //without temp variable way:
        a = a + b;//=30
        //System.out.println(a);
        b=a-b;
        System.out.println(b);//=10
        a=a-b;
        System.out.println(a); //=20


        // Swap 2 strings without a temporary variable?

        String x="Hello";
        String y="Welcome";
        x=x+y; //HelloWelcome
       // System.out.println(x.length());
        System.out.println(y.length());

        y=x.substring(0,(x).length()-y.length()); //y=hello
        x=x.substring(y.length()); //hellowelcome-hello
        System.out.println(x);
        System.out.println(y);

        //System.out.println(x.length());


    }
}

