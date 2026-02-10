public class Account {
    String accountNumber;
    double balance;
    AccountState accountState;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    public void deposit(double depositAmount){
        accountState.deposit(depositAmount);
    }

    public void withdraw(double withdrawAmount){
        accountState.withdraw(withdrawAmount);
    }

    public void activate(){
        accountState.activate();
    }

    public void suspend(){
        accountState.suspend();
    }

    public void close(){
        accountState.close();
    }

    public void detailsToString(){
        accountState.detailsToString();
    }

}