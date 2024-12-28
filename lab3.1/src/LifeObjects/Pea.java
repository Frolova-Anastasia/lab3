package LifeObjects;

import Enums.HandsProperty;
import Enums.Time;
import Exceptions.HandsException;
import NotAlive.NotAliveObjects;

public class Pea extends LifeObject {
    public Pea(String name) {
        super(name);
    }

    public void understand(Time when){
        System.out.printf("%s %s уразумел, что ", when, this);
    }

    public void getRid(LifeObject obj, NotAliveObjects something){
        System.out.printf("благодаря %s он избавился от %s \n", obj, something);
    }

    public void thankTo(Time how, LifeObject obj) {
        System.out.printf("%s %s благодарил %s \n", this, how, obj);
    }

    public void hugTo(LifeObject obj, HandsProperty handsProperty) throws HandsException {
        if(handsProperty == HandsProperty.SHORT){
        System.out.printf("Горошек обнимал %s по очереди, потому что руки были %s \n", obj, handsProperty);}

        else if(handsProperty == HandsProperty.LONG){
            System.out.printf("Горошку удалось обнять %s сразу, ведь руки были %s \n", obj, handsProperty);
        }

        else{
            throw new HandsException();
        }
    }


    public void calmDown(Time time){
        System.out.printf("%s Горошек успокоился \n", time);
    }



    @Override
    public String getName() {
        return name;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return name;
    }

}
