package animalsTask;

public class Animal {

    private String color;
    private int weight;
    private int height;

    public Animal (String color, int weight, int height){
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public Animal() {
    }

    public void move (){
    }

    @Override
    public boolean equals(Object object) {
        return  this.color.equals(((Animal) object).color);
    }
}
