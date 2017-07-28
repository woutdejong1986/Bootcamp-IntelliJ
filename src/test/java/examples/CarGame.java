package examples;

import org.testng.annotations.Test;

public class CarGame {

    @Test
    public void startGame(){
        Auto auto = new Auto();
        auto.setColor("Frozen Grey");
        auto.carDoors(5);
        auto.carBrand("Audi");
        auto.engineType("V8");
//        auto.carTorque(150, 3000);
    }

    @Test
    public void startGame1(){
        AutoAdvanced autoAdvanced = new AutoAdvanced("Audi", 150, 3000);

    }
}
