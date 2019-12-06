package Cars;

public class Car {

    public int fuelQuantity;
    public String brand;
    public boolean engineState = false;
    public boolean tankIsFull = true;
    public boolean gearBox;

    public Car (String brand, int fuelQuantity, boolean gearBox){
        this.brand = brand;
        this.fuelQuantity = fuelQuantity;
        this.gearBox = gearBox;
        engineState = false;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public boolean isEngineOn() {
        return engineState;
    }

    public boolean isTankIsFull() {
        return tankIsFull;
    }

    public void setTankIsFull(boolean tankIsFull) {
        this.tankIsFull = tankIsFull;
    }

    public boolean isGearBox() {
        return gearBox;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    public void turnEngineOn (Car car){
        engineState = car.isEngineOn();
        if (engineState == false) {
            System.out.println("The engine is turned on");
            car.setEngineState(true);
        }
        else {
            System.out.println("The engine was already ON");
        }
    }

    public void turnEngineOff (Car car) {
        engineState = car.isEngineOn();
        if (engineState = true) {
            System.out.println("The engine is turned off");
            car.setEngineState(false);
        } else {
            System.out.println("The engine was already ON");
        }
    }

    public void addFuel (Car car){
        turnEngineOff (car);
        fuelQuantity = car.getFuelQuantity();
        while (fuelQuantity < 10){
            fuelQuantity ++;
        }
    }

    public void verifyTankState (Car car){
        fuelQuantity = car.getFuelQuantity();
        if (fuelQuantity < 5 && fuelQuantity > 0){
            System.out.println("Fuelling needed");
            car.setTankIsFull(false);
            car.turnEngineOff(car);
        } else if (fuelQuantity > 5 && fuelQuantity < 10){
            System.out.println("The tank is full");
            car.setTankIsFull(true);
        } else {
            System.out.println("Is it a real car? It seems no.");
        }
    }

    public void turnGearOn (Car car){
        gearBox = car.isGearBox();
        if (gearBox == true){
            System.out.println("Turn Gear On");
        }
    }

    public void goHome (Car car){

        turnEngineOn(car);
        verifyTankState(car);
        if (tankIsFull == false){
            addFuel (car);
            turnEngineOn(car);
        }
        turnGearOn(car);
        System.out.println("Press the gas pedal");
        System.out.println("You'r at home");
    }
}
