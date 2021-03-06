package class16StringAndStringBiolder;

public class Task2 {
    public static void main(String[] args) {
        /*
         * Create a String that should be combination of letters, numbers and special
         * characters. Find out how many Alphanumeric characters are there in the String.
         */
        String s="1234!@#$%esdfAZSX123";
        System.out.println(s.length());
        //so first we can remove non alphanumeric characters and then check the length of alphanumeric:
        System.out.println(s.replaceAll("[^A-Za-z0-9]","").length());

        System.out.println(s.replaceAll("[^A-Za-z0-9@#]",""));
        // method chaining calling multiple methods on same line:
        System.out.println(s.replaceAll("[^A-Za-z0-9@#]","").length());

    }
}
