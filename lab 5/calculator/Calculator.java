package pjatk.calculator;

public class Calculator {
    private final int value1;
    private final int value2;
    private final int value3;
    private final int value4;
    private final int value5;
    private final int value6;
    public Calculator(int value1, int value2, int value3, int value4, int value5, int value6){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
        this.value6 = value6;

    }

    public int calculate(int value1){
        return value1*value1;
    }
    public int calculate(int value2, int value3){
        return value2*value3;
    }
    public int calculate(int value4, int value5, int value6){
        return value4+value5+value6;
    }

}
