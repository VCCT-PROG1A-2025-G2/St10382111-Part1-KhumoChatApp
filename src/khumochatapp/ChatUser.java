/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khumochatapp;

/**
 *
 * @author khumo St10382111@vcconnect.edu.za
 */
public class ChatUser {

    private String username, password, firstName, lastName, cellNumber;

    public ChatUser(String username, String password, String firstName, String lastName, String cellNumber) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellNumber = cellNumber;
    }

    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    public static boolean checkCellPhoneNumber(String cellNumber) {
        return cellNumber.startsWith("+") && cellNumber.length() >= 11;
    }

    public String registerUser() {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        } else {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you.";
        }
    }

    public boolean loginUser(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    public String returnLoginStatus(String inputUsername, String inputPassword) {
        if (loginUser(inputUsername, inputPassword)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you.";
        } else {
            return "Login failed. Please check your username and password.";
        }
    }
} 



