
import java.util.Scanner;

public class VirtualPetSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome and pet setup
        System.out.println("Welcome to the Virtual Pet Simulator!");
        System.out.print("Enter your pet's name: ");
        String petName = scanner.nextLine();

        VirtualPet pet = new VirtualPet(petName);
        System.out.println("You adopted a pet named " + petName + "!");

        boolean running = true;

        // Game loop
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed " + petName);
            System.out.println("2. Play with " + petName);
            System.out.println("3. Let " + petName + " sleep");
            System.out.println("4. Check " + petName + "'s status");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    pet.checkStatus();
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye! Thanks for taking care of " + petName + "!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Simulate time passing
            if (running) {
                pet.timePasses();
            }
        }

        scanner.close();
    }
}
