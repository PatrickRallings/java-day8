package Banking_Continued_Assignment;

import java.util.Scanner;

public class BankAccount {
    public Scanner scan = new Scanner(System.in);
    public String name;
    public double balance;
    public Integer accountNumber;
    public BankAccount(){
        System.out.println("What will be the name on your account?");
        this.name =  scan.nextLine();
        System.out.println("How much will you be depositing as your accounts starting balance?");
        this.balance = scan.nextDouble();
    };
    public BankAccount (String name, double balance, Integer accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void setBalanceDeposit(double num) {
        this.balance += num;
    }
    public void setBalanceWithdrawal(double num) {
        this.balance -= num;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String toString(String response) {
        return response;
    }
}
