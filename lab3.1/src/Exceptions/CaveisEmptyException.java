package Exceptions;

public class CaveisEmptyException extends RuntimeException {
    public CaveisEmptyException() {
        super("Никого нет в пещере");
    }
}
