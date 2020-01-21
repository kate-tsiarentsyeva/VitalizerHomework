package animalsTask;

public class Runner {

    public static void main(String[] args) {

        Cat murzik = new Cat ("red", 5, 30);
        Cat vaska = new Cat ("maincoon");

        Dog sharik = new Dog ("broun", 15, 50);
        Dog tuzik = new Dog ();

        Raccoon jony = new Raccoon ("white-black", 10, 30);
        Raccoon jooly = new Raccoon("white-black", 5, 32);

        Whale jimbo = new Whale (200, 30, 500);
        Whale nancy = new Whale ("black", 540, 120);

        murzik.move();
        vaska.move();

        sharik.move();
        tuzik.move();

        jony.move();
        jooly.move();

        jimbo.move();
        nancy.move();

        System.out.println(jony.equals(jooly));
        System.out.println(murzik.equals(nancy));

    }
}
