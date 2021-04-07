package pjatk.fraction;

public class Main {
    public static void main(String[] args) {
        Fraction first = new Fraction(3, 5);
        Fraction second = new Fraction(1, 2);
        Fraction aftersum = first.sum(second);
        System.out.println(aftersum);
        Fraction aftersubstration = first.substration(second);
        System.out.println(aftersubstration);
        Fraction aftermultpily = first.multiply(second);
        System.out.println(aftermultpily);
        Fraction afterdivision = first.divison(second);
        System.out.println(afterdivision);
    }
}
