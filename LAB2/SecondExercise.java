package pjatk;

import java.util.Arrays;
import java.util.Random;

public class SecondExercise {
    public static int[] sum(int[] array1, int[] array2){
        int[] array3;
        if (array1.length != array2.length){
            array3 = new int[0];
        }
        else {
            array3 = new int[array1.length];
            for(int counter = 0; counter < array2.length; counter++){
                array3[counter] = array1[counter] + array2[counter];
            }
        }
        return array3;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int array_size = rand.nextInt(5);
        int[] array1 = new int[array_size];
        int[] array2  = new int[array_size];
        for (int counter = 0; counter < array_size; counter++){
            int value_array1 = rand.nextInt(50);
            int value_array2 = rand.nextInt(50);
            array1[counter] = value_array1;
            array2[counter] = value_array2;

    }
        System.out.println(Arrays.toString(sum(array1,array2)));
}
}
