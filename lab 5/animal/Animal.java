package pjatk.animal;

public class Animal {
    public final String name;
    public final String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';

    }
}
