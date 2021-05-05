package pjatk.pliki.zad06;
import java.lang.Math;
public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcCircuit() {
        return 2*Math.PI*radius;
    }
}
