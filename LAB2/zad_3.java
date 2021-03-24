package pjatk;
import javafx.scene.control.Tab;

import java.util.Arrays;
import java.util.Scanner;

public class pr_8 {
    public static void main(String[] args) {
        int[] Tablica = {4,-2,2137,-26,25,-21};
        int i = 0;
        int c = 0;
        while (i< Tablica.length){
            if (Tablica[i] > 0){
                c = c+Tablica[i];
            }
            i++;
        }
    System.out.println(c);
    }
}