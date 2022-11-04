import Beepers.Beeper;
import Engines.Engine;
import Gearboxes.Gearbox;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engine engine,Gearbox gearbox) {
        super(beeper, engine, gearbox);
    }

    String getCost(){
        return "9999999999";
    }
}
