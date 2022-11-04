import Beepers.Beeper;
import Engines.Engine;
import Gearboxes.Gearbox;

public abstract class Car {

    Beeper beeper;
    Engine engine;

    Gearbox gearbox;

    public Car(Beeper beeper, Engine engine, Gearbox gearbox){
        this.beeper = beeper;
        this.engine = engine;
        this.gearbox = gearbox;
    };
}
