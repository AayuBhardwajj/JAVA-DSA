package Projects.BankAccount;
public abstract class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance ){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;

    }

    public void deposit(int amount){
        balance+=amount;
        System.out.println("Depositied Rs. "+amount);
    }

    public abstract void withdraw(double amount);

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getholderName(){
        return holderName;
    }

    public abstract void showAccountType();

}
