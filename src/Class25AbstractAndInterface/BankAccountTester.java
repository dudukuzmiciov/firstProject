package Class25AbstractAndInterface;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.printBalance("Habib","Habib123");
        //IF INSERT WRONG PASSWORD OR USERNAME WILL GET AN ERROR
        //SO ONLY THE OWNER SHOULD BE ABLE TO ACCESS(private method)
    }

}
