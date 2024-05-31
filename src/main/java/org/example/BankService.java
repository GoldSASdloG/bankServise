package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankService {
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
