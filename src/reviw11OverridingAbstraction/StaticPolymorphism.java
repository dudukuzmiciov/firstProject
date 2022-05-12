package reviw11OverridingAbstraction;

public class StaticPolymorphism {
    void method(int num,String name){
        System.out.println(num+" "+name);
    }
    void method(String name, int num){
        System.out.println(num+" "+name);
    }
}
class Test1{
    public static void main(String[] args) {
        StaticPolymorphism sp= new StaticPolymorphism();
        sp.method(10,"Yazgul"); //Java knows that we are calling the first method as we inserted number first
        //then name (int num, String name)
    }
}
