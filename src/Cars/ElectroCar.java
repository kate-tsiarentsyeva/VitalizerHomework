package Cars;

public class ElectroCar extends Car{

    public ElectroCar(String brand, int fuelQuantity, boolean gearBox) {
        super(brand, fuelQuantity, gearBox);
        Fuel type = Fuel.electricity;
    }

    @Override
    public void addFuel(Car car) {
        System.out.println("Add electricity to this car");
        fuelQuantity ++;
    }
}
