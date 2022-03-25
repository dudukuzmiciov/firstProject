package Class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        Suzuki suzuki=new Suzuki();
        suzuki.park();
        suzuki.start();
                  //POLYMORPHISM
        System.out.println(("*******"));
        Car car=new BMW();//WE CAN STORE THE CHILD CLASS INSIDE PARENT
        car=new Tesla();
        car=new Suzuki();
        car.start();
        //BMW bmw1=new Car();


    }
}
