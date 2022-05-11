package Banking_Continued_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<BankAccount> accounts = new ArrayList<>();
    public static void main(String[] args) {
        accounts.get(accounts.size()-1).getBalance();
    }
    public static void introduction() {
        System.out.println("Hello! Welcome to the bank!\nAre you an existing customer? Yes | No");
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Thank you for being a customer!");
        } else if (answer.equalsIgnoreCase("No")){
            System.out.println("The let's make a new account!");
            accounts.add(new BankAccount());
        } else {
            System.out.println("Sorry, I didn't understand your response, lets try again.");
            introduction();
        }
    }
    public void mainMenu(){
        String response = null;
        System.out.println("Welcome to the main menu. Which of the following would you like to do?\n1. Check Balance\n2. Withdraw\n3. Deposit\n4. Transfer\n5. Exit");
        response = scan.nextLine();
        String output;
        double amount;
        switch (response.toLowerCase()) {
            case "1":
            case "check balance":
                output = "Your balance is: "+accounts.get(accounts.size()-1).getBalance();
                break;
            case "2":
            case "withdraw":
                System.out.println("How much would you like to withdraw?");
                amount = scan.nextDouble();
                accounts.get(accounts.size()-1).setBalanceWithdrawal(amount);
                output = "You have withdrawn $"+amount+" and have a new balance of $"+accounts.get(accounts.size()-1).getBalance();
                break;
            case "3":
            case "deposit":
                System.out.println("How much would you like to deposit?");
                amount = scan.nextDouble();
                accounts.get(accounts.size()-1).setBalanceDeposit(amount);
                output = "You have deposited $"+amount+" and have a new balance of $"+accounts.get(accounts.size()-1).getBalance();
                break;
            case "4":
            case "transfer":
                break;
            case "5":
            case "exit":
                break;
            default:
                System.out.println("Please try again.");
                mainMenu();
        }
    }
    public void transfer(BankAccount sender, BankAccount receiver, double amount){

    }

}
