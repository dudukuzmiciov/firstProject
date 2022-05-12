package reviw11OverridingAbstraction;

public class AnimalTypeCasting {
    void Sleep(){
        System.out.println("animals sleep");
    }
}
class Dog extends AnimalTypeCasting{
    void sleep(){
        System.out.println("dog sleeps during the day");
    }
}
class Cat extends AnimalTypeCasting{
    void Sleep(){
        System.out.println("cat sleeps all day long");
    }
    void eat(){
        System.out.println("we like to eat fish");
    }
}
class Test2{
    public static void main(String[] args) {
        //Cat cat = new Dog();
        //Cat cat= new AnimalPolymorphism; - Down casting
        AnimalTypeCasting animal = new Cat(); //upcasting the cat can do only the things that AnimalPolymorphism can do!
        //animal.eat(); its an animal class and we cant use cat variable here.We can't use the methods that are
        // specific to Cat class only because right now it is behaving as an animal
       // Dog dog=(Dog)animal;
        //dog.Sleep();
        method(new Cat()); //now after writing the code on line35 we can call it
    }
    public static void method(AnimalTypeCasting animal){
        //create an instance of the Cat class
        if(animal instanceof Cat) {
            ((Cat) animal).eat();
        }else{
            System.out.println("you are not passing a cat inside the box animal");//related  to line 30, if we put Dog
            //instead of Cat, will get the }else{ condition sout
        }
    }
}
