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

Getting Started:

Prerequisites:
1. Java JDK 8 or above installed.
2. MySQL server running locally.
3. MySQL JDBC driver (Connector/J) added to your Java project classpath.

Setup Instructions:

Database Setup:

1. Open MySQL.
2. Run the SQL script below to create the required database and tables:

CREATE DATABASE IF NOT EXISTS Banking_System;
USE Banking_System;

CREATE TABLE user(
    full_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) PRIMARY KEY NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE accounts(
    account_number BIGINT PRIMARY KEY NOT NULL,
    full_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    balance DECIMAL(10, 2) NOT NULL,
    security_pin CHAR(4) NOT NULL
);

Configuration:

Set environment variables DB_USER and DB_PASS for your MySQL username and password, or update the code in BankingApp.java to use your credentials directly.

Run the Application.
1. Compile all .java files (make sure your JDBC driver JAR is in the classpath).
2. Run BankingApp.java as your main entry point.

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
