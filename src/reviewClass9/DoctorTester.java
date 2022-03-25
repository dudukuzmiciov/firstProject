package reviewClass9;

public class DoctorTester {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Jane", "Smith", "dermatologist");
        doc.printInfo();

        Doctor doc1 = new Doctor("John", "Smith");
        doc1.printInfo();

        System.out.println("changing the value of my instance value:");

        doc1.speciality = "Dermatologyst";
        doc1.printInfo();

        doc.printInfo();

        System.out.println("Changing the value of static variable");
        Doctor.hospital="Iova";
        doc.printInfo();
        doc1.printInfo();

        System.out.println("------------------");
        doc1.hospital="Best Hospital";
        doc.printInfo();
        doc1.printInfo();


        /*VARIABLES
          optional             optional             must         must
          accessModifier       nonAccessModifier   dataType     name;

           METHODS
           optional          optional              must         must
           accessModifiers   non access modifier   returnType   name()
         */
    }

}
