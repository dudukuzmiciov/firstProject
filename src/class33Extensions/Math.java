package class33Extensions;

public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
       /* if (b!=0){
            System.out.println(a/b);
        }else{
            System.out.println("you are trying to divide by zero which is not possible");
        } */
        //ANOTHER WAY:
        try {
            System.out.println(a / b);
        } catch (ArithmeticException are) {
            System.out.println("you are trying to divide by zero which is not possible"+are.getMessage()); //are.getMessage is
           // to also print the exact error message
            //POSSIBLE TO HAVE MULTIPLE CATCH BLOCKS
        } catch(NullPointerException npe){  //npe is just a name u can time anything (in this case its just an abreviation of
            //null pointer exception
            System.out.println("please initialize the obj to avoid this exception");
        }
    }
}
