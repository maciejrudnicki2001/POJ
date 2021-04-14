package pjatk.arguments;

public class Arguments {
    private final int value1;
    private final int value2;
    private final int value3;
    private final int value4;
    private final int value5;
    public Arguments(int value1,int value2, int value3, int value4, int value5){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
    }
    @Override
    public String toString(){
        return "Value1:" + value1 + "\nValue2:" + value2 + "\nValue3:" + value3 + "\nValue4:" + value4 + "\nValue5:" + value5;
    }

}
