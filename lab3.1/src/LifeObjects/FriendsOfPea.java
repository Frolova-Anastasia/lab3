package LifeObjects;

import Enums.PlaceType;
import Interfaces.Hide;

public class FriendsOfPea extends LifeObject implements Hide {
    public FriendsOfPea(String s) {
        super(s);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setPlace(PlaceType place){
        System.out.printf("%s отправились в путь %s \n", this, place);}


    @Override
    public void hide(PlaceType where) {
        System.out.printf("%s скрывались %s \n", where, this);
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
