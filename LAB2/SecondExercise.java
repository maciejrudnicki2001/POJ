package pjatk;

import java.util.Arrays;
import java.util.Random;

public class SecondExercise {
    public static void main(String[] args) {
        Random rand = new Random();
        int array_size = rand.nextInt(5);
        int[] array1 = new int[array_size];
        int[] array2  = new int[array_size];
        int[] array3;
        for (int counter = 0; counter < array_size; counter++){
            int value_array1 = rand.nextInt(50);
            int value_array2 = rand.nextInt(50);
            array1[counter] = value_array1;
            array2[counter] = value_array2;
        }
        if (array1.length != array2.length){
            array3 = new int[0];
            System.out.print(Arrays.toString(array3));
        }
        else {
            array3 = new int[array1.length];
            for (int counter2 = 0; counter2 < array_size; counter2++){
                array3[counter2] = array1[counter2] + array2[counter2];
            }
            System.out.print(Arrays.toString(array3));
        }
    }
}
