package NotAlive;

public class Death extends NotAliveObjects {
    public Death(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return name ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
