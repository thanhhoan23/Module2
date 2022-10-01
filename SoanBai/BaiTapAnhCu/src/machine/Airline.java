package machine;

import interfaceEx.Flyable;

public class Airline extends Machine implements Flyable {
    @Override
    public String fly() {
        return "Bay tren troi";
    }

}
