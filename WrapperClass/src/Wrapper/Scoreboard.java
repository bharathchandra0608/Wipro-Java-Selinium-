package Wrapper;

import java.util.HashMap;
import java.util.Scanner;

public class Scoreboard{

    public static Integer getValidScore(String scoreStr) {
        try {
            Integer score = Integer.valueOf(scoreStr); 
            if (score < 0) {
                System.out.println("❌ Score must be a non-negative number.");
                return null;
            }
            return score;
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid input. Please enter a valid number.");
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> scoreboard = new HashMap<>();

        while (true) {
            System.out.println("\n--- Scoreboard Menu ---");
            System.out.println("1. Add Player");
            System.out.println("2. Update Score");
            System.out.println("3. Display Scoreboard");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choiceStr = sc.nextLine();

            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid option (1-4).");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter player name: ");
                String name = sc.nextLine();

                System.out.print("Enter initial score (non-negative number): ");
                String scoreStr = sc.nextLine();

                Integer score = getValidScore(scoreStr);
                if (score != null) {
                    scoreboard.put(name, score);
                    System.out.println("✅ Player added.");
                }

            } else if (choice == 2) {
                System.out.print("Enter player name: ");
                String name = sc.nextLine();

                if (!scoreboard.containsKey(name)) {
                    System.out.println("❌ Player not found.");
                    continue;
                }

                System.out.print("Enter score to add (non-negative): ");
                String addScoreStr = sc.nextLine();
                Integer addScore = getValidScore(addScoreStr);

                if (addScore != null) {
                    Integer currentScore = scoreboard.get(name);
                    scoreboard.put(name, currentScore + addScore);
                    System.out.println("✅ Score updated.");
                }

            } else if (choice == 3) {
                System.out.println("\n--- Scoreboard ---");
                for (String player : scoreboard.keySet()) {
                    System.out.println(player + ": " + scoreboard.get(player));
                }

            } else if (choice == 4) {
                System.out.println("👋 Exiting...");
                break;

            } else {
                System.out.println("❌ Invalid option. Try 1 to 4.");
            }
        }

        sc.close();
    }
}
