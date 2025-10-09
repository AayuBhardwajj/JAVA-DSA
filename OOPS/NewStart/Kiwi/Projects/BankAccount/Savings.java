package Projects.BankAccount;

public class Savings extends BankAccount{
    public Savings(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }
        @Override
        public void withdraw(double amount){
            if(balance>=amount){
                balance-=amount;
                System.out.println("Rs. "+amount+" has been withdrawed");
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        @Override
        public void showAccountType(){
            System.out.println("Savings account");
        }        

    }

