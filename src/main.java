import Beepers.Beeper;
import Beepers.Horn;
import Beepers.MagicSound;
import Engines.Engine;
import Engines.EngineV12;
import Engines.EngineV6;
import Gearboxes.AutoGearbox;
import Gearboxes.Gearbox;
import Gearboxes.ManualGearbox;

public class main {

    public static void main(String[] args) {
        //  создать машину

        Beeper horn = new Horn();
        Beeper magicSound = new MagicSound();

        Engine engineV12 = new EngineV12();
        Engine engineV6 = new EngineV6();

        Gearbox autoGearbox = new AutoGearbox();
        Gearbox manualGearbox = new ManualGearbox();

        Lambo lambo = new Lambo(horn, engineV12, autoGearbox);
        Priora priora = new Priora(magicSound, engineV6, manualGearbox);
        Bus bus = new Bus(horn,engineV6,manualGearbox);
        
        System.out.println("===================");

        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.gearbox.swSpeed());
        System.out.println(lambo.getCost());
        System.out.println("===================");

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.gearbox.swSpeed());
        System.out.println(priora.downShifting());
        System.out.println("===================");

        System.out.println(bus.beeper.makeSound());
        System.out.println(bus.engine.getSpeed());
        System.out.println(bus.gearbox.swSpeed());
        System.out.println(bus.costForDrive());
        System.out.println("===================");
    }

}
