package Enums;

public enum PlaceType {

    UNDERGROUND("по готовому подземному ходу"),
    CAVE("В пещере"),
    HALL("еще один коридор");

    private final String val;

    PlaceType(String s) {
        val = s;
    }

    public String toString() {
        return val;
    }
}
