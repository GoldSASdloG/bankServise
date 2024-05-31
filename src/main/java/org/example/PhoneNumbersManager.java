package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbersManager {
    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
    private Set<String> phoneNumbers = new HashSet<>();
    private String singlePhoneNumber;

    public PhoneNumbersManager(String initialPhoneNumber) {
        singlePhoneNumber = initialPhoneNumber;
        phoneNumbers.add(initialPhoneNumber);
    }

    public boolean addPhoneNumber(String newPhoneNumber) {
        if (phoneNumbers.contains(newPhoneNumber)) {
            System.out.println("Номер " + newPhoneNumber + " уже существует и не может быть добавлен.");
            return false;
        } else {
            phoneNumbers.add(newPhoneNumber);
            System.out.println("Номер " + newPhoneNumber + " успешно добавлен.");
            return true;
        }
    }

    public void removePhoneNumber(String phoneNumber) {
        if (phoneNumbers.size() > 1 || !phoneNumbers.contains(phoneNumber)) {
            phoneNumbers.remove(phoneNumber);
            System.out.println("Номер " + phoneNumber + " успешно удален.");
        } else {
            System.out.println("Нельзя удалить единственный номер " + phoneNumber);
        }
    }

//    public static void main(String[] args) {
//        PhoneNumbersManager phoneNumberManager = new PhoneNumbersManager("+7 (123) 456-78-90");
//        phoneNumberManager.addPhoneNumber("+7 (111) 222-33-44");
//        phoneNumberManager.addPhoneNumber("+7 (123) 456-78-90");
//
//        phoneNumberManager.removePhoneNumber("+7 (123) 456-78-90");
//        phoneNumberManager.removePhoneNumber("+7 (111) 222-33-44");
//        phoneNumberManager.removePhoneNumber("+7 (111) 222-33-44"); // Попытка удалить уже удаленный номер
//    }
}
