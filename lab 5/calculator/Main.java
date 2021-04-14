package pjatk.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(1));
        System.out.println(calc.calculate(2,3));
        System.out.println(calc.calculate(4,5,6));
    }

}
