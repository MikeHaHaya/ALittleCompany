package exceptions;

public class DepartmentException extends ALittleCompanyException{

    public DepartmentException() {
    }

    public DepartmentException(String message) {
        super(message);
    }

    public DepartmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentException(Throwable cause) {
        super(cause);
    }

    public DepartmentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
