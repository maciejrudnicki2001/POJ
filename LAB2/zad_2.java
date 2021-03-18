package pjatk;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class pr_7 {

    public static void main(String[] args) {
        Random rand = new Random();
        int c = rand.nextInt(10);
        int[] Tablica = new int[c];
        int[] Tablica2 = new int[c];
        int[] Tablica3 = new int[c];
        int i = 0;
        while(i < c){
            //Wprowadziłem generowanie liczb
            Random rand1 = new Random();
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