package Checkers;

import Exceptions.WayisnotReadyException;

import static java.lang.Math.random;

public class WayChecker {
    public void checkWayAvailability() throws WayisnotReadyException {
        int n = (int) (random() * 10);
        if (n < 6) {
            System.out.println("Путь есть!");
        } else {
            throw new WayisnotReadyException();
        }
    }
}
