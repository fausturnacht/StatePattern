public class SuspendedState implements AccountState{
    private Account account;

    public SuspendedState(Account account){
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
        account.accountState = new ActiveState(account);
        System.out.println("Account is activated!");
    }

    public void suspend(){
        System.out.println("Account is already suspended!");
    }

    public void close(){
        account.accountState = new ClosedState(account);
        System.out.println("Account is closed!");
    }

    public void detailsToString(){
        System.out.println("Account Number: " + account.accountNumber 
        + "\nAccount Balance: " + account.balance);
    }
}
