package hu.iit.me.Exceptions;

public class JobIsExistsException extends Exception {
    public JobIsExistsException() {
        super();
    }

    public JobIsExistsException(String message) {
        super(message);
    }

    public JobIsExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobIsExistsException(Throwable cause) {
        super(cause);
    }

    protected JobIsExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
