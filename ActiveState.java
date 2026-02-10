public class ActiveState implements AccountState{
    private Account account;

    public ActiveState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount){
        System.out.println("Successfully deposited " + depositAmount + " into the account.");
        account.balance += depositAmount;
        detailsToString();
    }

    public void withdraw(double withdrawAmount){
        System.out.println("Successfully withdrew " + withdrawAmount + " out of the account.");
        account.balance -= withdrawAmount;
        detailsToString();
    }

    public void activate(){
        System.out.println("Account is already active!");
    }

    public void suspend(){
        account.accountState = new SuspendedState(account);
        System.out.println("Account is suspended!");
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
