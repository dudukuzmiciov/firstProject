public class Super {
    String color="Red";
}
class Chair extends Super{
    String color="black";

    void printColor(){
        System.out.println(color);//prints color of Chair class
        System.out.println(super.color);//prints color SuperConstructorInheritance class
    }
}
class MainClass{
    public static void main(String[] args) {
        Chair obj=new Chair();
        obj.printColor();
    }
}
