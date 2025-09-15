Banking Management System
A simple command-line Java Banking Management System with MySQL database, allowing users to create bank accounts, login securely, and manage basic banking operations (debit, credit, transfer, balance check) via JDBC.

Features:
1. User Registration and Login: Sign up with name, email, and password; login to access all features.
2. Bank Account Management: Open new bank accounts with unique account numbers.

Transactions:

1. Credit and debit money from accounts.
2. Transfer funds between accounts.
3. Secure transaction handling with PIN verification.
4. Balance Inquiry: Check your available balance at any time.
5. Secure Authentication: Passwords and PINs required for sensitive actions.

Technologies Used:

Java (Core, JDBC)
MySQL (Database)
JDBC Driver (MySQL Connector/J)

How To Use:
1. Register a new user with full name, email, and password.
2. Login with registered email and password.
3. Open a bank account (if not already present).    

Use the menu to:
1. Debit or credit money.
2. Transfer funds to another account.    
3. Check your account balance.
4. Log out when finished.

Security Notes:
This project is for learning purposes. For production, do NOT store passwords or security pins as plain text—use secure hashing.
Input validation and error handling should be enhanced for real-world deployment.
