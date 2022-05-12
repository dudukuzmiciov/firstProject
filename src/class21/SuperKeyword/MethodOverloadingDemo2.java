package class21.SuperKeyword;

public class MethodOverloadingDemo2 {

    static void printInfo(String name, int age, double weight){
        System.out.println(name+" "+age+" "+weight);

    }
    static void printInfo(int age,String name, double weight){
        System.out.println(name+" "+age+" "+weight);

}
    static void printInfo(double weight,String name, int age) {
        System.out.println(name + " " + age + " " + weight);
    }
    static void printInfo(double weight,int age,String name) {
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 methodOverloadingDemo2 = new MethodOverloadingDemo2();
        methodOverloadingDemo2.printInfo("Zulfiya", 16, 28);
    }
    }
