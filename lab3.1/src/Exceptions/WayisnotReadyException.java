package Exceptions;

public class WayisnotReadyException extends RuntimeException{
    public WayisnotReadyException(){
        super("не получилось отправиться в путь, попросите крота его вырыть");
    }
}
