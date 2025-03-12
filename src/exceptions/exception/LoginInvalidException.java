package exceptions.exception;

public class LoginInvalidException extends Exception {

    public LoginInvalidException() {
        super("Login inválido");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
