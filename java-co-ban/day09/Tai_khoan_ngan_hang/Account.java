/**
 * Account
 */
public class Account implements IAccount{

    private String name;
    private String accountNumber;
    private String email;
    private double accountBalance;

    public Account(String name, String accountNumber, String email, double accountBalance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    @Override
    public void recharge(double amount) {
        // TODO Auto-generated method stub
        this.accountBalance = this.accountBalance + amount;
    }
    @Override
    public void changeEmail(String email) {
        // TODO Auto-generated method stub
        this.email = email;
    }
    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        System.out.printf("%-30s %-30s %-30s %-30s\n",this.name, this.accountNumber, this.email, this.accountBalance);
    }




}