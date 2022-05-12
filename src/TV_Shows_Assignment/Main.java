package TV_Shows_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String currentName;
    public static String currentGenre;
    public static Integer currentEpisodeCount;
    public static ArrayList<TVShow> showsList = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        showsList.add(new TVShow("name", 1, "genre"));
        showsList.add(new TVShow("name", 500));
        showsList.add(new TVShow("name", "genre"));
        showsList.add(new TVShow("name"));
        showsList.add(new TVShow(1));
        showsList.add(new TVShow());
        while (true) {
            System.out.println("Name of the show: ");
            currentName = scan.nextLine();
            if (currentName.equalsIgnoreCase("")) {
                break;
            }
            System.out.println("How many episodes?");
            String temp = scan.nextLine();

            if (temp.equalsIgnoreCase("")) {
                break;
            } else {
                currentEpisodeCount = Integer.valueOf(temp);
            }
            System.out.println("What is the genre?");
            currentGenre = scan.nextLine();
            if (currentGenre.equalsIgnoreCase("")) {
                break;
            }
            showsList.add(new TVShow(currentName, currentEpisodeCount, currentGenre));
        }
        if (showsList.size() > 0) {
            output(showsList);
        } else {
            System.out.println("You did not add any animals.");
        }
    }
    public static void output(ArrayList<TVShow> showList) {
        for (TVShow tvShow : showList) {
            System.out.println(tvShow.toString());
        }
    }
}
