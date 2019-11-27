package animalsTask;

public class Cat extends Animal {

    private String breed;
    private String type;
    private String color;
    private int weight;
    private int height;

    public  Cat(String breed){
        this.breed = breed;
        type = "mammal";
    }

    public Cat(String color, int weight, int height) {
        super(color, weight, height);
    }

    @Override
    public void move() {
        System.out.println("Cat moves its furry paws");
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
