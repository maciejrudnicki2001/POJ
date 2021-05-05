package pjatk.pliki.zad06;

public class Rectangle implements Shape{
    private final double b;
    private final double c;

    public Rectangle(double b, double c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        return this.b * this.c;
    }

    @Override
    public double calcCircuit() {
        return this.b* 2 + this.c *2;
    }
}
