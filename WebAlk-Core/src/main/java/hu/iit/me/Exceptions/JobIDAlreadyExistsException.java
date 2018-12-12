package hu.iit.me.Exceptions;

public class JobIDAlreadyExistsException extends Exception {
    public JobIDAlreadyExistsException() {
        super();
    }

    public JobIDAlreadyExistsException(String message) {
        super(message);
    }

    public JobIDAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobIDAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    protected JobIDAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
