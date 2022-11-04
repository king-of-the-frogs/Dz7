import Beepers.Beeper;
import Engines.Engine;
import Gearboxes.Gearbox;

public class Priora extends Car {
    public Priora(Beeper beeper, Engine engine, Gearbox gearbox) {
        super(beeper, engine, gearbox);
    }

    String downShifting(){
        return "Занижена";
    }
}
