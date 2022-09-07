package com.bridgelabz.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationInput {
    private Pattern pattern;
    private Matcher matcher;

    public boolean isFirstNameValid(String firstName){
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean isLastNameValid(String lastName) {
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean isEmailValid(String email) {
        String regex = "[a-z0-9.]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean isMobileNumberValid(String mobilenumber) {
        String regex = "(91)?[7-9][0-9]{9}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(mobilenumber);
        return matcher.matches();
    }
    public boolean isPasswordValid(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
