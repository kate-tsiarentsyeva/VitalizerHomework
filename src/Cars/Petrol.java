package Cars;

public class Petrol extends Car{

    public Petrol(String brand, int fuelQuantity, boolean gearBox) {
        super(brand, fuelQuantity, gearBox);
        Fuel type = Fuel.petrol;
    }

    @Override
    public void addFuel(Car car) {
        System.out.println("Add petrol to the tank");
        fuelQuantity ++;
    }
}
