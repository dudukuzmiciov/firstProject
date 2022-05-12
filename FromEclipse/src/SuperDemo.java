public class SuperDemo {
}
class AAA{

}
class BBB extends AAA{
    String name;

    BBB(String name){
        //this(); WE CAN NOT USE this() and super() inside the same constructor
        super();
        this.name=name;
    }
}
