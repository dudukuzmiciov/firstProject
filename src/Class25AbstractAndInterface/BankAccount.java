package Class25AbstractAndInterface;

public class BankAccount {
    //ENCAPSULATION

    //first step make the variables private
    private double balance=1234;
    private String userName="Habib";
   private String password="Habib123";

   //only this person should be able to access it

//GENERATE GETTER SETTER BY RIGHT CLICKING:
    public double getBalance() { //ALWAYS TYPE GET INFO
        return balance;
    }

    public void setBalance(double balance) { //THEN SET INFO
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    void printBalance(String userName, String password){
        if(userName.equals(this.userName)&&password.equals(this.password)){
            System.out.println(balance);
        }else{
            System.out.println(-1);//-1 in java means error
        }
    }
}
