package LifeObjects;

import java.util.Objects;

public abstract class LifeObject{
    protected final String name;

    public LifeObject(String name) {
        this.name = name;
    }

    public abstract String getName();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LifeObject that = (LifeObject) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "LifeObjects.LifeObject{" +
                "name='" + name + '\'' +
                '}';
    }
}
