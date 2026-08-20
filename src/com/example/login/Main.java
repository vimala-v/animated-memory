package com.example.login;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username;
        String password;

        Console console = System.console();
        if (console != null) {
            username = console.readLine("Username: ");
            char[] pwd = console.readPassword("Password: ");
            password = (pwd == null) ? "" : new String(pwd);
        } else {
            // Fallback when running from an IDE or where System.console() is null
            Scanner sc = new Scanner(System.in);
            System.out.print("Username: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            password = sc.nextLine();
            sc.close();
        }

        if ("root".equals(username) && "root".equals(password)) {
            System.out.println("Successfully logged in");
        } else {
            System.out.println("Login failed");
        }
    }
}
