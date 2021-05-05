package pjatk.pliki.zad06;

public class Square implements Shape{
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calcArea() {
        return this.a * this.a;
    }

    @Override
    public double calcCircuit() {
        return this.a * 4;
    }
}
