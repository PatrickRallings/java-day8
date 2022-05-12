package Counter_Constructors_Assignment;


import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcome to the counter.\nWhat would you like your starting value to be?");
        Counter counter = new Counter(Double.parseDouble(scan.nextLine()));
        while (true) {
            System.out.println("Select one of the options below:\n1. Add one\n2. Subtract one\n3. Add specific value\n4. Subtract specific value\n5. Exit");
            String response = scan.nextLine();
            double num;
            if (response.equalsIgnoreCase("1")||response.equalsIgnoreCase("Add one")) {
                counter.increase();
                System.out.println("Your number is now: "+counter.value());
                continue;
            }
            if (response.equalsIgnoreCase("2")||response.equalsIgnoreCase("Subtract one")) {
                counter.decrease();
                System.out.println("Your number is now: "+counter.value());
                continue;
            }
            if (response.equalsIgnoreCase("3")||response.equalsIgnoreCase("Add specific value")) {
                System.out.println("How much would you like to increase by?");
                num = Double.parseDouble(scan.nextLine());
                counter.increase(num);
                System.out.println("Your number is now: "+counter.value());
                continue;
            }
            if (response.equalsIgnoreCase("4")||response.equalsIgnoreCase("Subtract specific value")) {
                System.out.println("How much would you like to decrease by?");
                num = Double.parseDouble(scan.nextLine());
                counter.decrease(num);
                System.out.println("Your number is now: "+counter.value());
                continue;
            }
            if (response.equalsIgnoreCase("5")||response.equalsIgnoreCase("Exit")) {
                break;
            }
        }
    }

}
