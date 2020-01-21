package animalsTask;

public class Dog extends Animal {

    private String type;
    private String residence;
    private String color;
    private int weight;
    private int height;

    public  Dog(){
        type = "mammal";
    }

    public Dog(String color, int weight, int height) {
        super(color, weight, height);
    }

    @Override
    public void move() {
        System.out.println("The dog runs wagging its tail");;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
