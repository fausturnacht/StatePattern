public class ClosedState implements AccountState{
    private Account account;

    public ClosedState(Account account){
        this.account = account;
    }
    
    @Override
    public void deposit(double depositAmount){
        System.out.println("You cannot deposit on a suspended account!");
        detailsToString();
    }

    public void withdraw(double withdrawAmount){
        System.out.println("You cannot withdraw on a suspended account!");
        detailsToString();
    }

    public void activate(){
        System.out.println("You cannot activate a closed account!");
    }

    public void suspend(){
        System.out.println("You cannot suspend a closed account!");
    }

    public void close(){
        System.out.println("Account is already closed!");
    }

    public void detailsToString(){
        System.out.println("Account Number: " + account.accountNumber 
        + "\nAccount Balance: " + account.balance);
    }
}
