package Enums;

public enum HandsProperty{
    SHORT("слишком коротки"),
    LONG("длинные"),
    ABSENT("");
    private final String val;

    HandsProperty(String s){
        val = s;
    }
    public String toString(){
        return val;
    }
}
