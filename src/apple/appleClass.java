package apple;

public class appleClass {

    private String color;
    private String taste;
    private int weight;




    public appleClass(String color, String taste, int weight) {
        this.color = color;
        this.taste = taste;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "appleClass{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", weight=" + weight +
                '}';
    }
}
