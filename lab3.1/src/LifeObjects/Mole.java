package LifeObjects;

import Enums.PlaceType;
import Interfaces.Dig;

public class Mole extends LifeObject implements Dig {

    public Mole(String s) {
        super(s);
    }

    @Override
    public String getName() {
        return name;
    }

   @Override
    public void dig(PlaceType what){
        System.out.printf("Крот вырыл %s \n", what);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
