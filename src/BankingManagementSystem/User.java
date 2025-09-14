package BankingManagementSystem;

import java.sql.*;
import java.util.Scanner;
public class User {
    private Connection connection;
    private Scanner sc;

    public void register() {
        sc.nextLine();
        System.out.println("Full name: ");
        String fullName = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        if (userExists(email)) {
            System.out.println("User already exists for this email.");
            return;
        }

        String registerQuery = "INSERT INTO user (fullName, email, password) VALUES (?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(registerQuery);
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Registration successful.");
            } else {
                System.out.println("Registration failed.");
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public String login() {
        sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        String loginQuery = "SELECT FROM user WHERE email = ? AND password = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return email;
            } else {
                return null;
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public boolean userExists(String email) {
        String query = "SELECT * FROM user WHERE email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
