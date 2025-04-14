package com.mycompany.javaappchat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sodia
 */
public class Login {
    
     private String storedUsername;
    private String storedPassword;

    public Login(String username, String password) {
        this.storedUsername = username;
        this.storedPassword = password;
    }
//ChatGPT (2025) 
    public boolean loginUser(String inputUsername, String inputPassword) {
        return storedUsername.equals(inputUsername) && storedPassword.equals(inputPassword);
    }

    public String returnLoginStatus(boolean success) {
        return success ? "Login successful!" : "Login failed. Username or password is incorrect.";
    }
    
}
