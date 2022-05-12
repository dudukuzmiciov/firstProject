public class MethodOverloadDemo {
    //When same method exists with the same name(add) but a different data types its called method overloading

    // HERE WE OVERLOAD  THE METHODS BY CHANGING THE DATA TYPES OF THE PARAMETERS
    //CHECK EACH METHODS PARAMETERS :
    //tHEN CHECK METHOD OVERLOADING2 FOR OTHER TYPE OF MO.

    static void add(int num1, int num2){
        System.out.println("M1");
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2){
        System.out.println("M2");
        System.out.println(num1+num2);
    }
    static void add(String num1, String num2){
        System.out.println("M3");
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        add(10,10); //FIRST METHOD WILL PRINT BECAUSE WE DECLARED INT NOT DOUBLE.
        //IF WE DELETE FIRST METHOD THEN SECOND WILL TRANSFORM INT (10,10)INTO DOUBLE(10.0,10.0)
        add("10","10");

        //So  method overloading is created, passing methods with the same name(action) and then
        //you calling and passing parameters, java desides which method to pick depending on the parameters,
        //if give string parameters in main, java searches in method overload if we have such parameters and calls
        //that particular method



    }
}
