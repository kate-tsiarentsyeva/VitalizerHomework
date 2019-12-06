package Cars;

public class Runner {

    public static void main(String[] args) {

        Diesel mondayCar = new Diesel ("Opel", 7, true);
        ElectroCar tuesdayCar =  new ElectroCar ("VW", 3, false);
        Petrol thirsdayCar = new Petrol ("Jaguar", 8, true);

        mondayCar.goHome(mondayCar);
        tuesdayCar.goHome(tuesdayCar);

    }
}
