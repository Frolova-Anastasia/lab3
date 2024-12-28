package NotAlive;

public abstract class NotAliveObjects {
    protected String name;

    public NotAliveObjects(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "NotAlive.NotAliveObjects{" +
                "name='" + name + '\'' +
                '}';
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
