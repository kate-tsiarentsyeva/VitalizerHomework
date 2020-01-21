package Cars;

public class Runner {

    public static void main(String[] args) {

        Car mondayCar = new Diesel ("Opel", 7, true);
        Car tuesdayCar =  new ElectroCar ("VW", 3, false);
        Car thirsdayCar = new Petrol ("Jaguar", 8, true);

        mondayCar.goHome(mondayCar);
        tuesdayCar.goHome(tuesdayCar);
        thirsdayCar.goHome(thirsdayCar);

    }
}
