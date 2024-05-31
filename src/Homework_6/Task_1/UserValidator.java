package Homework_6.Task_1;

public class UserValidator {

    public static boolean validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || password == null || confirmPassword == null) {
            return false;
        }

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login должен быть меньше 20 символов и не содержать пробелов.");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password должен быть меньше 20 символов, не содержать пробелов и содержать хотя бы одну цифру.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и confirmPassword должны совпадать.");
        }

        return true;
    }
}
