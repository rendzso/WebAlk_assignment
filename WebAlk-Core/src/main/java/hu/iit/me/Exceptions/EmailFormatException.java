package hu.iit.me.Exceptions;

public class EmailFormatException extends Exception {
    public EmailFormatException() {
        super();
    }

    public EmailFormatException(String message) {
        super(message);
    }

    public EmailFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailFormatException(Throwable cause) {
        super(cause);
    }

    protected EmailFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
