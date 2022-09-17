package entities.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVErsionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
