package animalsTask;

public class Raccoon extends Animal {

    private String type;
    private String color;
    private int weight;
    private int height;

    public  Raccoon(){
        type = "mammal";
    }

    public Raccoon(String color, int weight, int height) {
        super(color, weight, height);
    }

    @Override
    public void move() {
        System.out.println("This fat fluffy sneaks on its hind legs.");;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
