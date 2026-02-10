public class Account{
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public void deposit(){
        
    }
}