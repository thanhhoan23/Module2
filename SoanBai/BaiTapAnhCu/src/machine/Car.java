package machine;

import interfaceEx.Runnable;

public class Car extends Machine implements Runnable {
    @Override
    public String run() {
        return "Chay tren duong";
    }
}
