package Animal_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String currentName;
    public static String currentIsDog;
    public static ArrayList<Animal> animals = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter a name: ");
            currentName = scan.nextLine();
            if (currentName.equalsIgnoreCase("")) {
                break;
            }
            System.out.println("Is it a dog? Yes | No");
            currentIsDog = scan.nextLine();
            if (currentIsDog.equalsIgnoreCase("")) {
                break;
            }
            animals.add(new Animal(currentName, toBoolean(currentIsDog)));
        }
        if (animals.size() > 0) {
            output(animals);
        } else {
            System.out.println("You did not add any animals.");
        }
    }
    public static void output(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
    public static Boolean toBoolean(String currentIsDog) {
        return currentIsDog.equalsIgnoreCase("yes") || currentIsDog.equalsIgnoreCase("yeah") || currentIsDog.equalsIgnoreCase("yep") || currentIsDog.equalsIgnoreCase("yea");
    }
}