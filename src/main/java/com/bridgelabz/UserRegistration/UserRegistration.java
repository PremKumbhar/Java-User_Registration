package com.bridgelabz.UserRegistration;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("User registration problem");
        Scanner sc = new Scanner(System.in);
        UserRegistrationInput userRegistration = new UserRegistrationInput();
        ArrayList<String> emails = new ArrayList<>();

        System.out.println("Enter first name ");
        String firstName = sc.next();
        if (userRegistration.isFirstNameValid(firstName))
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");

        System.out.println("Enter last name ");
        String lastName = sc.next();
        if (userRegistration.isLastNameValid(firstName))
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");

        System.out.println("Enter email ");
        String email = sc.next();
        if (userRegistration.isEmailValid(email))
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");

        System.out.println("Enter mobilenumber ");
        String mobilenumber = sc.next();
        if (userRegistration.isMobileNumberValid(mobilenumber))
            System.out.println("Valid mobile number");
        else
            System.out.println("Invalid mobile number");

        System.out.println("Enter password ");
        String password = sc.next();
        if (userRegistration.isPasswordValid(password))
            System.out.println("Valid password");
        else
            System.out.println("Invalid password");

        // Valid Emails
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        // Invalid Emails
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");

        for (String mail : emails){
            if (userRegistration.isEmailValid(mail))
                System.out.println(mail + " Valid Email");
            else
            System.out.println(mail + " Invalid Email");

        }
    }
}