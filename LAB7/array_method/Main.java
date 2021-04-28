package pjatk.array_method;

public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
        sum = sum(new int[]{3,4,5}, new int[]{6,8,8}, new int[]{1,2,3});
        System.out.println("Sum:" + sum);
    }

    private static int sum(final int[] ... numbersArray){
        int sum = 0;
        for (final int[] numbers : numbersArray){
            for (final int number : numbers){
                sum += number;
            }
        }
        return sum;
    }
}
