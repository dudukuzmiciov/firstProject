package class22MthdOverloading;

public class StaticUsage {
}
class Cat{
    static int NoOfLegs=4;
    String name;

    public void printInfo(){
        System.out.println(name+NoOfLegs);
    }
    /*public static void Print(){
        System.out.println(name+NoOfLegs);
        !!!!! SO WE CAN NOT ACCESS INSTANCE FIELDS INSIDE STATIC METHOD! */
    }

