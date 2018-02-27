package ics.astro.tap;

public class TapException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * TapException with just a message
     *
     * @param message: the message to show
     */
    public TapException(String message) {
        super(message);
    }

    /**
     * TapException with the message and initial exception.
     *
     * @param message: the message to show
     * @param cause: the exception causing this one
     */
    public TapException(String message, Exception cause) {
        super(message, cause);
    }
}
