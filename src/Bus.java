import Beepers.Beeper;
import Engines.Engine;
import Gearboxes.Gearbox;

public class Bus extends Car {
    public Bus(Beeper beeper, Engine engine,Gearbox gearbox) {
        super(beeper, engine, gearbox);
    }

    String costForDrive(){
        return "50 рублей за проезд";
    }
}

