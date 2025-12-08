import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Basic greeting and setup
        System.out.println("Welcome to Beginner Fitness App!");
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter starting activity level (1-3): ");
        int level = input.nextInt();

        User user = new User(name, level);
        ProgramEngine engine = new ProgramEngine();

        int choice = 0;

        // Simple functional menu for Phase 2
        while (choice != 4) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Get today's suggestion");
            System.out.println("2. Complete an activity");
            System.out.println("3. View progress");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            if (choice == 1) {
                // Display a suggested exercise
                Exercise suggestion = engine.getDailySuggestion(user);
                System.out.println("Today's recommendation: " + suggestion.getName());
            }

            else if (choice == 2) {
                // Increase progress when user completes an activity
                user.completeActivity();
                System.out.println("Activity recorded! Progress is now: " + user.getProgress());
            }

            else if (choice == 3) {
                // Show user progress and current level
                System.out.println("User: " + user.getName());
                System.out.println("Activity Level: " + user.getActivityLevel());
                System.out.println("Progress: " + user.getProgress());
            }

            else if (choice == 4) {
                System.out.println("Exiting program. Goodbye!");
            }
        }
    }
}
