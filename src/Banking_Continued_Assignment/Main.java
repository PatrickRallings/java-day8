package Banking_Continued_Assignment;

public class Main {

    public static void main(String[] args) {
        //Bank Account Assignment
        BankAccount PatrickR = new BankAccount("Patrick Rallings", 500);
        PatrickR.setBalanceDeposit(100);
        PatrickR.getAccount();
        //Bank Transfer Assignment
        bankTransfer();

    }
    public static void bankTransfer() {
        BankAccount Matt = new BankAccount("Matt", 5000);
        BankAccount Tim = new BankAccount("Tim", 300);
        Transfer id1 = new Transfer(Matt, Tim, 100);
        id1.send();
        Matt.getAccount();
        Tim.getAccount();
    }
}
