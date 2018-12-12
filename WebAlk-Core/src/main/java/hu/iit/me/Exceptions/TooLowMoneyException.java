package hu.iit.me.Exceptions;

public class TooLowMoneyException extends Exception {
    public TooLowMoneyException() {
        super();
    }

    public TooLowMoneyException(String message) {
        super(message);
    }

    public TooLowMoneyException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooLowMoneyException(Throwable cause) {
        super(cause);
    }

    protected TooLowMoneyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
