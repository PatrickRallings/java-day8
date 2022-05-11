package Banking_Continued_Assignment;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount (String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void setBalanceDeposit(double num) {
        this.balance += num;
    }
    public void setBalanceWithdrawal(double num) {
        this.balance -= num;
    }
    public void getAccount() {
        System.out.println("Account Holder: "+this.name+"\nBalance: "+this.balance);
    }
}
