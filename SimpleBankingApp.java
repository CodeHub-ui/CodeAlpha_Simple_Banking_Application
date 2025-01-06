import java.util.*; // Importing the Scanner class for user input

public class SimpleBankingApp {

    // Method to display the main menu
    public static void displayMenu() {
        System.out.println("Simple Banking Application");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        double balance = 0.0; // Initialize balance to zero

        // Infinite loop to keep the program running until the user chooses to exit
        while (true) {
            displayMenu(); // Display the main menu
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt(); // Read user's choice

            // Option 1: Check balance
            if (choice == 1) {
                System.out.println("Your balance is: $" + balance);
            } 
            // Option 2: Deposit money
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double deposit = scanner.nextDouble(); // Read deposit amount
                balance += deposit; // Add deposit amount to balance
                System.out.println("You have deposited: $" + deposit);
            } 
            // Option 3: Withdraw money
            else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawal = scanner.nextDouble(); // Read withdrawal amount
                // Check if there is enough balance for the withdrawal
                if (withdrawal > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= withdrawal; // Deduct withdrawal amount from balance
                    System.out.println("You have withdrawn: $" + withdrawal);
                }
            } 
            // Option 4: Exit the program
            else if (choice == 4) {
                System.out.println("Thank you for using the Simple Banking Application.");
                break; // Exit the loop to end the program
            } 
            // Handle invalid options
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close(); // Close the Scanner object to release resources
    }
}
