package pjatk.pliki.zad06;


import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>() {{
            add(new Square(4));
            add(new Rectangle(2, 6));
            add(new Circle(9));
        }};

        for (final Shape shape : shapes) {
            System.out.printf("\n"+shape.getClass().getSimpleName() +"\t Area:"+ shape.calcArea() +"\t Circuit:"+  shape.calcCircuit());
        }
    }
}
