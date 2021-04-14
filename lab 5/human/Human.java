package pjatk.human;

public class Human {
    private final String name;
    private final int age;
    private static final String POWER = "None";

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String power() {
        return POWER;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", power=" + POWER +
                '}';
    }
}
