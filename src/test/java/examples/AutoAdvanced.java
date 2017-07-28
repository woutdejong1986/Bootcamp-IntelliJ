package examples;

public class AutoAdvanced {

    public String brand;

    public AutoAdvanced(String brand, int force, int RPM){
        this.brand = brand;
        System.out.println("Car is ready to drive");
        System.out.println("Brand of the car is " + brand);
        calculateTorque(force, RPM);

    }

    public void calculateTorque(int force, int RPM){
        int torque = (force * 5252) / RPM;
        System.out.println("Torque of the car is: " + torque);
    }
}
