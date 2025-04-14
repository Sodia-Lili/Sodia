package com.mycompany.javaappchat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sodia
 */
public class Registration {
    private String name;
    private String surname;
    private String username;
    private String password;
    private String phoneNumber;

    public Registration(String name, String surname, String username, String password, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    Registration(String username, String password, String phone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Registration() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()_+=<>?{}\\[\\]~`|/\\:;\"',.-].*");
    }

    public boolean checkCellPhoneNumber() {
        return phoneNumber.matches("\\+27\\d{9}");
    }
//ChatGPT (2025) 
    public String registerUser() {
        if (!checkUserName()) {
            return "Username must contain an underscore and be no more than 5 characters.";
        }
        if (!checkPasswordComplexity()) {
            return "Password must be at least 8 characters and contain a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Phone number must start with +27 and be followed by 9 digits.";
        }
        return "Registration successful!";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

