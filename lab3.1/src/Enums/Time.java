package Enums;

public enum Time {
    ATFIRST("Сначала"),
    THEN("потом"),
    IMMEDIATELY("сразу"),

    FINALLY("В конце концов"),
    CONTINUOUSLY("без конца");

    private final String val;
    Time(String s){
        val = s;
    }
    public String toString(){
        return val;
    }
}
