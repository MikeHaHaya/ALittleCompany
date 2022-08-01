package exceptions;

public class ALittleCompanyException extends Exception{

    public ALittleCompanyException() {
    }

    public ALittleCompanyException(String message) {
        super(message);
    }

    public ALittleCompanyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ALittleCompanyException(Throwable cause) {
        super(cause);
    }

    public ALittleCompanyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
