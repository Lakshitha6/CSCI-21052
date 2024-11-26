public class BankAccount {

   private int balance ;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int deposit){
        this.balance += deposit;
    }

    public void withdraw(int withdraw){
        if (balance > 0 && balance-withdraw > 0){
            balance -= withdraw ;
        }

        else
            System.out.println("Don't perform withdraw !");
    }

    public int getBalance(){
        return balance;
    }


}