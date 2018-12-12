package hu.iit.me.Exceptions;

public class SearchTagIsEmptyException extends Exception {
    public SearchTagIsEmptyException() {
        super();
    }

    public SearchTagIsEmptyException(String message) {
        super(message);
    }

    public SearchTagIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public SearchTagIsEmptyException(Throwable cause) {
        super(cause);
    }

    protected SearchTagIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
