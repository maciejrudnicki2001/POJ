package pjatk;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class pr_7 {

    public static void main(String[] args) {
        int[] Tablica = new int[3];
        int[] Tablica2 = new int[3];
        int[] Tablica3 = new int[3];
        int i = 0;
        while(i < 3){
            //Wprowadziłem generowanie liczb
            Random rand = new Random();
            int a = rand.nextInt(50);
            int b = rand.nextInt(50);
            Tablica[i] = a;
            Tablica2[i] = b;
            Tablica3[i] = a+b;
            i++;
        }
        System.out.println("Tablica1: "+Arrays.toString(Tablica));
        System.out.println("Tablica2: "+Arrays.toString(Tablica2));
        System.out.println("Tablica3: "+Arrays.toString(Tablica3));

    }
}