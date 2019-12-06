package Cars;

public class Diesel extends Car{

    public Diesel(String brand, int fuelQuantity, boolean gearBox) {
        super(brand, fuelQuantity, gearBox);
        Fuel type = Fuel.diesel;
    }

    @Override
    public void addFuel(Car car) {
        System.out.println("Add diesel to the tank");
        fuelQuantity ++;
    }
}
