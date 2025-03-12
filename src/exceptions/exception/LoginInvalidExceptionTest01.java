package exceptions.exception;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            logon();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }

    }

    private static void logon() throws LoginInvalidException {
        String userNameDB = "admin";
        String passwordDB = "admin";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = keyboard.nextLine();
        System.out.println("Enter your password:");
        String password = keyboard.nextLine();

        if(!userName.equals(userNameDB) || !password.equals(passwordDB)) {
            throw new LoginInvalidException("Usuário ou senha inválido");
        }

        System.out.println("Logon successfully");
    }
}
