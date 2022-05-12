package reviw11OverridingAbstraction;

public class MethodOveridingParent {
    public void method1(){
        System.out.println("i like mango");
    }
    public void method2(){
        System.out.println("hello worlds");
    }
}
class Child extends MethodOveridingParent{
    //SO, in method overriding if you dont like the parent method you can always provide our own implementation:
    public void method1(){
        System.out.println("i like apple");
    }
}
class Test{
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        //will get in console "i like apple" (not mango) and "hello world
    }
}
