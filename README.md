README:  ATM System

Overview:
The  ATM System is a simple Java program designed to simulate basic ATM functionalities such as checking balance, depositing funds, and withdrawing funds. This README provides an overview of the system's functionality, structure, and usage instructions.

 Functionality:
1. Authentication: Users are required to enter their user ID and PIN to access the ATM services.
2. Services:
   - Check Balance: Displays the current balance of the user's account.
   - Deposit: Allows users to deposit funds into their account.
   - Withdraw: Allows users to withdraw funds from their account.
3. User Management:
   - Users can create new accounts if their user ID is not recognized during authentication.

 Structure:
- User Class: Represents a user account with attributes such as user ID, PIN, and account balance. Provides methods to retrieve account information and perform transactions.
- ATM Class: Contains the main method and implements the ATM functionalities. It includes methods for authentication, balance inquiry, deposit, withdrawal, and user creation.

 Usage:
1. Compile and Run:
   - Compile the Java files: `javac User.java Atm.java`
   - Run the program: `java Atm`
2. Authentication:
   - Enter your user ID and PIN when prompted.
   - If the user ID is not recognized, you will be prompted to create a new account.
3. Services:
   - Follow the on-screen prompts to select desired services (Check Balance, Deposit, Withdraw).
   - Input the amount for deposit or withdrawal when prompted.

 Note:
- This program is a basic simulation and does not include advanced security features or error handling mechanisms.
- For educational purposes, feel free to modify and enhance the code according to specific requirements.

 Author:
- This program was authored by SRIRAMKUMAR T.

 Version:
- Version: 1.0
- Date: 04.03.2024

Feel free to reach out for any inquiries or suggestions regarding the  ATM System. Thank you for using our ATM service!