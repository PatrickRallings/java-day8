package Banking_Continued_Assignment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<BankAccount> accounts = new ArrayList<>();
    static Integer currentAccount;
    static Integer transferTarget;
    static String output = null;
    static boolean noExit = true;
    static String response;
    static double amount;
    static DecimalFormat f = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        accounts.add(new BankAccount("Patrick", 1.00, 0));
        accounts.add(new BankAccount("Matt", 1000000.00, 1));
        introduction();
        while (noExit) {
            mainMenu(accounts.get(currentAccount));
            if (output != null) {
                System.out.println(accounts.get(currentAccount).toString(output));
            }
        }
    }

    public static void introduction() {
        System.out.println("Hello! Welcome to the bank!\nAre you an existing customer? Yes | No");
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Thank you for being a customer, what is your account number?");
            currentAccount = Integer.valueOf(scan.nextLine());
        } else if (answer.equalsIgnoreCase("No")) {
            System.out.println("The let's make a new account!");
            accounts.add(new BankAccount());
            currentAccount = accounts.size() - 1;
            accounts.get(currentAccount).setAccountNumber(currentAccount);
        } else {
            System.out.println("Sorry, I didn't understand your response, lets try again.");
            introduction();
        }
        System.out.println("Thank you for your business!");
    }

    public static void mainMenu(BankAccount obj) {
        System.out.println("Hello " + obj.getName() + "! Welcome to the main menu. Which of the following would you like to do?\n1. Check Balance\n2. Withdraw\n3. Deposit\n4. Transfer\n5. Exit");
        response = scan.nextLine();
        switch (response.toLowerCase()) {
            case "1":
            case "check balance":
                output = "Your balance is: " + f.format(obj.getBalance());
                break;
            case "2":
            case "withdraw":
                System.out.println("How much would you like to withdraw?");
                amount = scan.nextDouble();
                obj.setBalanceWithdrawal(amount);
                System.out.println(obj.getBalance());
                output = "You have withdrawn $" + f.format(amount) + " and have a new balance of $" + f.format(obj.getBalance());
                break;
            case "3":
            case "deposit":
                System.out.println("How much would you like to deposit?");
                amount = scan.nextDouble();
                obj.setBalanceDeposit(amount);
                output = "You have deposited $" + f.format(amount) + " and have a new balance of $" + f.format(obj.getBalance());
                break;
            case "4":
            case "transfer":
                System.out.println("What is the ID number of the account you would like to transfer to?");
                transferTarget = scan.nextInt();
                if (accounts.get(transferTarget) != null) {
                    System.out.println("How much would you like to transfer?");
                    amount = scan.nextDouble();
                    transfer(accounts.get(transferTarget), amount);
                    output = "You have successfully transferred $" + f.format(amount) + " to " + accounts.get(transferTarget).getName() + ".\nYour new balance is: $" + f.format(obj.getBalance());
                } else {
                    System.out.println("That account does not exist. Please try again.");
                    mainMenu(accounts.get(currentAccount));
                }
                break;
            case "5":
            case "exit":
                noExit = false;
                break;
        }
    }

    public static void transfer(BankAccount target, double amount) {
        accounts.get(currentAccount).setBalanceWithdrawal(amount);
        target.setBalanceWithdrawal(amount);
    }

}
