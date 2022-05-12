class  UserClass{ //1.userClass created
    String name; //1. instance variables
    String mobileNumber;
    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class UserInfo extends UserClass{ //2.subclass created
    String userAddress;//2.variables initialize through constructor:
    UserInfo(String userAddress,String name, String mobileNumber){ //constructor HAS TO HAVE at
        super(name, mobileNumber);                               //least the same variables as parent class+the extra one
        this.userAddress=userAddress;                         //that u need to add. can not contain less.
    }
    void userDetail(){ //3.print the details.
        System.out.println("name ="+name+" mobile number = "+mobileNumber+" Address = "+userAddress);
    }
}

public class constructorAndThisKeyword {
    /*1.create a program: userClass that has a constructor that initializes instance
    variable name and mobile number.
     2.Create a subclass userInfo that will have user
    address variable and it also being initialized through constructor call.
    3.Print user name, mobile number and address in userDetails method.
    4.Test your code.
     */
    public static void main(String[] args) { //4.testing the code
        UserInfo obj = new UserInfo("Dmitryi", "123456789","USA");
        obj.userDetail();
    }
}


