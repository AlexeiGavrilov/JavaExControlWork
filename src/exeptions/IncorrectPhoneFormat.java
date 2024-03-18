package exeptions;

public class IncorrectPhoneFormat extends RuntimeException{
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public IncorrectPhoneFormat() {
        super("Формат номера введен некорректно");
    }
}
