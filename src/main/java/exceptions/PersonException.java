package exceptions;

public class PersonException extends ALittleCompanyException{

    public PersonException() {
    }

    public PersonException(String message) {
        super(message);
    }

    public PersonException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonException(Throwable cause) {
        super(cause);
    }

    public PersonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
