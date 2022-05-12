public class MethodOverloading2 {
    //method also works by changing the sequens of the parameters (the order in
    //which variables are declared)chech the variables inside each method:
    void printInfo(String name, int age, double weight) {
        System.out.println("M1");
        System.out.println(name + " " + age + " " + weight);
    }

    void printInfo(int age, String name, double weight) {
        System.out.println("M2");
        System.out.println(name + " " + age + " " + weight);
    }

    void printInfo(String name, double weight, int age) {
        System.out.println("M3");
        System.out.println(name + " " + age + " " + weight);
    }

    void printInfo(int age, double weight, String name) {
        System.out.println("M4");
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();
        obj.printInfo("Zulfyia", 16, 28.0); //SO CONSOLE will print
                                                     //out "M1" because that is the best match.
    }
}