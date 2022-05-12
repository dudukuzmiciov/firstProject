package review13;

import org.apache.poi.util.StringUtil;

public class EncapsulationFacebook {
    private String name;
    private int age;
    private String password;
    private String gender;
    private String phoneNumber;
    void setName(String name){
        if(name.length()<=20 && !Stringutil.contains(name,"[0-9]")){
            this.name=name;
        }else {
            System.out.println("Name should be less than 20 characters" +
                    " and it should not contain numbers");
        }
    }

    void setAge(int age){
        if(age>5&&age<150){
            this.age=age;
        }else {
            System.out.println("This age is not allowed");
        }
    }
    void setPassword(String password){
        if(password.length()>=8&&!password.contains(name)){
            this.password=password;
        }
    }
    String getName(String password){
        if(this.password.equals(password)){
            return name;
        }else {
            return "";
        }

    }
    public void createAccount(String name,int age,
                              String password,String
                                      gender,
                              String phoneNumber){
        if(name.length()<=20){
            this.name=name;
            this.age=age;
            this.password=password;
            this.gender=gender;
            this.phoneNumber=phoneNumber;
        }
    }
    public  void browseFacebook(){
        System.out.println(name+" is Scrolling facebook");
    }
}
      class   FacebookTester{
       public static void main(String[] args) {
           EncapsulationFacebook faceBook=new EncapsulationFacebook();
               faceBook.setName("Samim");
           System.out.println(Stringutil.contains("ab123","[0-9]"));
       }
}

 class Stringutil{

    public static   boolean  contains(String str, String regex){
        String newStr=str.replaceAll(regex," ");
        return  !newStr.equals(str);
    }
}

