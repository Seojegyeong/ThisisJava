package BankApplication;

public class Account {
    private String accountNumber;
    private String owner;
    private int balance;

    public Account(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwner(){
        return owner;
    }

    public int getBalance(){
        return balance;
    }

    // 예금 및 출금
    public void setBalance(int balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
}
