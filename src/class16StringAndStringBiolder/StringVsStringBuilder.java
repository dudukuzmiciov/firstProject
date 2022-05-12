package class16StringAndStringBiolder;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        //String class is imutable - cant change,when calling a method on the string class it will not reflect
        //the same method on the original string. (does not apply for string builder class)
        String s = new String("Asghar Is Great"); //original string
        s.concat("hahah"); //add new String hahha to the original string
        System.out.println(s); //printing out the original string

        //String builder is mutable-it changes and when calling the object it will return a changed string
        StringBuilder stringBuilder = new StringBuilder("Asghar Is Great");//original string
        stringBuilder.append("Hahha"); //add new String hahha to the string
        //append works like concat in string class which cant be used in string builder
        System.out.println(stringBuilder); //printing out the original string

       /* String str = "";
        for(int i=0;i<1000;i++){
            str+=i;
       in this case, because the string value will change over and over again, intelliJ will suggest
       to use string builder (because string class will use loads of memory:
*/
        StringBuilder str=new StringBuilder();
        for(int i=0;i<1000;i++){
            str.append(i); //THIS WILL BE THE CORRECT CODE INSTEAD OF REGULAR STRING CLASS line17-19
        }

        //Till 1:55


    }
}
