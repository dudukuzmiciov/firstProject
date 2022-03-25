package Class24AbstractInterface;

public interface Employee {
    public static final int age=10;
    //by default all variables in an interface are public static final (line 4 and 20)
    void work();
    //All the methods inside an interface which do not have a body are abstract and are public.
}
class Tester implements Employee{

    @Override
    public void work() {
        System.out.println("Testing the website");

    }

    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        System.out.println(Employee.age);
        Employee tester2=new Tester();


    }
}
