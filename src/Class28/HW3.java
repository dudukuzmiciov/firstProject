package Class28;

import java.util.HashSet;
import java.util.Set;

public class HW3 {
    public static void main(String[] args) {
        /*Create a Set collection that will hold Objects of Student Type. In this set we do not care about the
        insertion order. Each student object should have name and studentID. Display name of each student.
         */
        //HashSet but can only be typed ->
        Set<Student> students =new HashSet<>();
        students.add(new Student("Habib","12343"));
        students.add(new Student("Dana","12348"));
        students.add(new Student("Boris","12393"));
        for(Student s:students){
            s.printName();
        }

    }
}
class Student{
    String name;
    String studentId;
    Student(String name, String studentId){
        this.name=name;
        this.studentId=studentId;
    }
    void printName(){
        System.out.println(name);
    }
}
