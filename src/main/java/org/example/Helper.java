package org.example;

public class Helper {
//    Для решения данной задачи я предлагаю создать следующие сущности и методы:
//
//    Сущность User:
//
//    id (уникальный идентификатор пользователя)
//    name (ФИО пользователя)
//    birthDate (дата рождения пользователя)
//    phoneNumber (номер телефона пользователя)
//    email (email пользователя)
//    account (ссылка на банковский аккаунт пользователя)
//    Сущность BankAccount:
//
//    id (уникальный идентификатор аккаунта)
//    balance (баланс аккаунта)
//    interestRate (процентная ставка)
//    Методы:
//
//    createUser(name, birthDate, phoneNumber, email, initialBalance): создает нового пользователя
//    с указанными данными и начальным балансом на счете.
//            updatePhoneNumber(userId, newPhoneNumber): обновляет номер телефона пользователя.
//    updateEmail(userId, newEmail): обновляет email пользователя.
//            deletePhoneNumber(userId): удаляет номер телефона пользователя (если есть другой контакт, то удалять нельзя).
//    deleteEmail(userId): удаляет email пользователя (если есть другой контакт, то удалять нельзя).
//    transfer(fromUserId, toUserId, amount): переводит указанную сумму с одного аккаунта на другой.
//    calculateInterest(): начисляет проценты на все банковские аккаунты.
//    Пример реализации:
//
//            import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//    public class BankingService {
//        private static List<User> users = new ArrayList<>();
//
//        public static User createUser(String name, LocalDate birthDate, String phoneNumber, String email, double initialBalance) {
//            // Проверяем, что номер телефона и email не заняты
//            if (getUserByPhoneNumber(phoneNumber) != null || getUserByEmail(email) != null) {
//                throw new IllegalArgumentException("Phone number or email is already in use");
//            }
//
//            User user = new User(name, birthDate, phoneNumber, email, new BankAccount(initialBalance));
//            users.add(user);
//            return user;
//        }
//
//        public static void updatePhoneNumber(long userId, String newPhoneNumber) {
//            User user = getUserById(userId);
//            if (getUserByPhoneNumber(newPhoneNumber) != null) {
//                throw new IllegalArgumentException("Phone number is already in use");
//            }
//            user.setPhoneNumber(newPhoneNumber);
//        }
//
//        public static void updateEmail(long userId, String newEmail) {
//            User user = getUserById(userId);
//            if (getUserByEmail(newEmail) != null) {
//                throw new IllegalArgumentException("Email is already in use");
//            }
//            user.setEmail(newEmail);
//        }
//
//        public static void deletePhoneNumber(long userId) {
//            User user = getUserById(userId);
//            if (user.getPhoneNumber() == null && user.getEmail() == null) {
//                throw new IllegalArgumentException("Cannot delete the last contact");
//            }
//            user.setPhoneNumber(null);
//        }
//
//        public static void deleteEmail(long userId) {
//            User user = getUserById(userId);
//            if (user.getPhoneNumber() == null && user.getEmail() == null) {
//                throw new IllegalArgumentException("Cannot delete the last contact");
//            }
//            user.setEmail(null);
//        }
//
//        public static void transfer(long fromUserId, long toUserId, double amount) {
//            User fromUser = getUserById(fromUserId);
//            User toUser = getUserById(toUserId);
//
//            if (fromUser.getAccount().getBalance() < amount) {
//                throw new IllegalArgumentException("Insufficient funds");
//            }
//
//            fromUser.getAccount().withdraw(amount);
//            toUser.getAccount().deposit(amount);
//        }
//
//        public static void calculateInterest() {
//            for (User user : users) {
//                user.getAccount().calculateInterest();
//            }
//        }
//
//        private static User getUserById(long userId) {
//            return users.stream()
//                    .filter(user -> user.getId() == userId)
//                    .findFirst()
//                    .orElseThrow(() -> new IllegalArgumentException("User not found"));
//        }
//
//        private static User getUserByPhoneNumber(String phoneNumber) {
//            return users.stream()
//                    .filter(user -> user.getPhoneNumber() != null && user.getPhoneNumber().equals(phoneNumber))
//                    .findFirst()
//                    .orElse(null);
//        }
//
//        private static User getUserByEmail(String email) {
//            return users.stream()
//                    .filter(user -> user.getEmail() != null && user.getEmail().equals(email))
//                    .findFirst()
//                    .orElse(null);
//        }
//    }
//
//    Данная реализация использует ArrayList для хранения пользователей, а также методы для поиска пользователей
//    по идентификатору, номеру телефона и email. Методы для обновления и удаления контактов проверяют, что у
//    пользователя остается хотя бы один контакт. Метод transfer проверяет, что у отправителя
//    достаточно средств на счете.
//
//    }
}
