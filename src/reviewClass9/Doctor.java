package reviewClass9;

public class Doctor {
    //instance variables declared inside the class but outside  of any
    //method, constructor or block
    String firstName;
    String lastName;
    String speciality;
    static String hospital = "Jorge Washington"; //static variable is declared inside the class but
    //outside any method, constructor or any block of code

    //static methods can access only static variables
    static void work() { //instance method
        System.out.println("All doctors work at " + hospital);
    }

    //next we are creating a constructor
    //with the help of the  constructor we are initializing variables
    //constructor can have access modifiers (public,protected,default)
    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //To have multiple constructors by OVERLOADING them:
    Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;

        //static method can not access non static variables:
        //static void printInfo(){ //static method
        //System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
    }
        //non-static methods can access static members/var
        void printInfo() { //static method
        this.hello(); //calling a method (line42)  of the same class, but we can write it without this.(compiler adds it)
            System.out.println("Doctor " + firstName + " " + lastName + " is a " + speciality+" at "+hospital);
        }
        static void work1() {
            System.out.println("All doctors work at " + hospital);
        }
        void hello(){ //default method
            System.out.println("Hello");
        }
    }


