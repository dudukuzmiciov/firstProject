public class ConstructorInheritance {
    String name; //(name Tristan)
    int age; // age 25
    double weight; //weight 91.0

    public ConstructorInheritance(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println(name+ " "+age+" "+weight);
    }
}
class ConstructorInheritanceChild extends ConstructorInheritance{
    public ConstructorInheritanceChild(String name, int age, double weight){
        super(name, age, weight); //MOSTLY USED SUPER() AT JOBS
        /* because constructors from parent class dont participate in inheritance we
        need to create a matching constructor in the child class as well, we can use
        super() to call the constructor from the parent class so that we dont have to repeat the code
         */
    }
}
 class Test{
     public static void main(String[] args) {
         ConstructorInheritanceChild  obj= new ConstructorInheritanceChild("Tristan", 25, 91);
         obj.printInfo();
     }

 }
