package pjatk;

public class ThirdTask {
    public static int sum(int[][] array, int[][] array2){
        int sum = 0;
        for (int counter1 = 0; counter1 < array.length; counter1++){
            for (int counter2 = 0; counter2 < array.length; counter2++){
                sum = sum + array[counter1][counter2]+ array2[counter1][counter2];
            }
        }
        return sum;
    }
}
