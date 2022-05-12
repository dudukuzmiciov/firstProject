public class SuperCallingAmethod {
    void color(){
        System.out.println("furniture color");
    }
}
class Chair1 extends SuperCallingAmethod{
    void color(){
        System.out.println("chair color");
    }
    void height(){
        System.out.println("5 ft ");
    }
    void sing(){
        super.color();
        height();
    }
}
class MainClass1{
    public static void main(String[] args) {
        Chair obj =new Chair();
        //obj.sing();
    }
}
