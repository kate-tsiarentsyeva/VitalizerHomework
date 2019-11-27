package animalsTask;

public class Whale extends Animal {

private String type;
private int length;
private String color;
private int weight;
private int height;
private int age;

    public Whale(String color, int weight, int height) {
        super(color, weight, height);
    }

    public Whale (int length, int age, int weight){
        this.age = age;
        this.length = length;
        this.weight = weight;
        color = "black";
        type = "swimming";
    }

    @Override
    public void move() {
        System.out.println("This magnificent whale cuts water surface.");;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
