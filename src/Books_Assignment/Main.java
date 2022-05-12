package Books_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static String title;
    public static Integer pagesCount;
    public static Integer yearPublished;
    public static String dataScope;
    public static ArrayList<Book> booksList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter book title:");
            title = scan.nextLine();
            if (title.equalsIgnoreCase("")){
                break;
            }
            System.out.println("Enter number of pages:");
            pagesCount = Integer.valueOf(scan.nextLine());
            System.out.println("Enter year published:");
            yearPublished = Integer.valueOf(scan.nextLine());
            booksList.add(new Book(title, pagesCount, yearPublished));
            booksList.add(new Book("onlyTitle"));
            booksList.add(new Book("titleAndYear", 1));
            booksList.add(new Book(100));
            booksList.add(new Book(100, 1994));
            booksList.add(new Book());
        }
        System.out.println("Would you like to view all of your information, or just the names of your book(s)?\nEverything | Name");
        dataScope = scan.nextLine();
        for (Book book : booksList) {
            System.out.println(book.toString(dataScope));
        }
    }
}
