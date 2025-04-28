package week5.projects.enumsExample;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true; // Flag to control the main loop

        while (running) {
            System.out.println("\nEnter a day (e.g., MONDAY, TUESDAY) or type 'EXIT' to quit:");
            String input = scanner.nextLine().trim().toUpperCase(Locale.ENGLISH);  // Convert user input to uppercase

            if (input.equals("EXIT")) {
                System.out.println("Exiting the program. Goodbye!");
                running = false; // End the loop
                break;
            }

            boolean validDay = false;

            for (Days day : Days.values()) {
                if (day.name().equalsIgnoreCase(input)) { // Check if input matches any enum constant
                    System.out.println("Working hours for " + day + ": " + day.getWorkingHours());
                    validDay = true;
                    break;
                }
            }

            if (!validDay) {
                System.out.println("Invalid day entered. Please try again.");
            }
        }

        scanner.close();
    }
}
