/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package khumochatapp;

import java.util.Scanner;

/**
 *
 * @author khumo St10382111@vcconnect.edu.za
 */


public class KhumoChatApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Register User ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter cell phone number: ");
        String cellNumber = scanner.nextLine();

        ChatUser user = new ChatUser(username, password, firstName, lastName, cellNumber);
        System.out.println(user.registerUser());

        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        System.out.println(user.returnLoginStatus(loginUsername, loginPassword));

        scanner.close();
    }
}

