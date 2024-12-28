package Checkers;

import Exceptions.CaveisEmptyException;

import static java.lang.Math.random;

public class CaveChecker {
    public void checkCaveAvailability() throws CaveisEmptyException {
        int n = (int) (random() * 10);
        if (n < 5) {
            System.out.println("Кто-то есть!");
        } else {
            throw new CaveisEmptyException();
        }
    }
}
