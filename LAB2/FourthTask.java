package pjatk;

public class ThirdTask {
    public static void main(String[] args) {
        int[] array = {14,5,-23,-34,21,37,28};
        int sum = 0;
        for (int counter = 0; counter < array.length; counter++){
            sum = sum + array[counter];
        }
        System.out.println(sum);
    }
}
