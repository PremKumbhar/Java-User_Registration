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
}
