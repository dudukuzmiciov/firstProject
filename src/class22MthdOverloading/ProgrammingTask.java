package class22MthdOverloading;

public class ProgrammingTask {
    /*Create a class "Programming". While creating an object of the class, if nothing is passed  to it, the message
     "i love programing" should be printed. If some String is passed  to it, then in place of "programing languages"
     the value variable should be printed.
     */
    public static void main(String[] args) {
        Programming programming=new Programming();
        new Programming("Java");
    }
    //we can overload the main method as well in overloading:(just change the name of types or var or method
    //just change the string name which main method is passing:
    //so i just copy pasted first method and changed String type:
    public static void main(String Ali) {
        Programming programming = new Programming();
        new Programming("Java");
    }
}
class Programming{
    Programming(){
        System.out.println("i love programing"); //first part of task.
    }
    //create another constructor to accomodate part  two of task
    Programming(String str){
        System.out.println("i love "+str);

    }
}
