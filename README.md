# Simple Banking Application

## Description
The **Simple Banking Application** is a basic console-based Java program designed for beginners to learn and practice fundamental programming concepts. It allows users to perform simple banking operations such as checking their balance, depositing money, withdrawing money, and exiting the program.

## Features
- **Check Balance**: Displays the current account balance.
- **Deposit**: Allows users to add money to their account balance.
- **Withdraw**: Allows users to withdraw money, ensuring sufficient funds.
- **Exit**: Safely exits the program.

## Technologies Used
- **Language**: Java
- **Development Environment**: Compatible with any Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) or terminal.

## How to Use

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.

### Setup Instructions
1. Clone or download this repository.
2. Open the project in your favorite Java IDE or a text editor.
3. Compile the program:
   ```bash
   javac SimpleBankingApp.java
   ```
4. Run the program:
   ```bash
   java SimpleBankingApp
   ```

## Example Usage
```
Simple Banking Application
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option: 1
Your balance is: $0.0

Simple Banking Application
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option: 2
Enter deposit amount: 100.0
You have deposited: $100.0

Simple Banking Application
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option: 1
Your balance is: $100.0

Simple Banking Application
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option: 3
Enter withdrawal amount: 50.0
You have withdrawn: $50.0

Simple Banking Application
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option: 1
Your balance is: $50.0

Simple Banking Application
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option: 3
Enter withdrawal amount: 60.0
Insufficient balance!

Simple Banking Application
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Please select an option: 4
Thank you for using the Simple Banking Application.
```
## File Structure
- `SimpleBankingApp.java`: The main program file.
- `README.md`: Documentation for the project.

## Code Explanation
- *Scanner Class:* Used for reading input from the user.
- *Main Menu:* Displayed repeatedly using a loop until the user chooses to exit.
- *Balance Handling:* The balance variable stores the current account balance, which is updated after deposits or withdrawals.
- *Validation:* Ensures the user cannot withdraw more than the available balance.

## Future Enhancements
- Add user authentication (e.g., username and password).
- Implement multiple account types (e.g., savings, checking).
- Add file storage to save and retrieve account data.
- Include transaction history for tracking deposits and withdrawals.
- Improve error handling for invalid input (e.g., non-numeric values).

## Contributing
Contributions are welcome! If you find any bugs or want to improve the program, feel free to create a pull request or open an issue

## License
This project is open-source and available under the MIT License. Feel free to contribute and enhance its features.

## Contact
For any queries or feedback, feel free to reach out to:
- **Name**: Harshit Gupta 
- **Email**: mrharshitgupta81@gmail.com 
