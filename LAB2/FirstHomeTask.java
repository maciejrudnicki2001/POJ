package pjatk;

import java.util.Arrays;
import java.util.Scanner;

public class FirstHomeTask {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many signs do you want: ");
        int how_many_signs = scanner.nextInt();
        String[] array = new String[how_many_signs];
        
        
        array[0] = scanner.nextLine();
        
        System.out.println("Which sign would you like to add to an array:");
        for (int counter = 0; counter < how_many_signs; counter++){

            array[counter] = scanner.nextLine();
            System.out.println("Which sign would you like to add to an array:");
            
        }
        System.out.println(Arrays.toString(array));
    }
}
