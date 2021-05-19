package pjatk.l10_task5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int[] human_nums = new int[6];
    private static int[] pc_nums = new int[6];
    public static void main(String[] args) {
        selectNumbers();
        random_nums();
        System.out.println("You catch:" + findMatches(human_nums,pc_nums) + "\tnumbers");
    }
    private static void selectNumbers(){
        System.out.println("Enter 6 numbers between 1 and 49:");

        for(int i = 0; i < human_nums.length; i++){
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            human_nums[i] = num;
        }
    }
    private static void random_nums(){
        for(int i = 0; i < pc_nums.length; i++){
            int number = new Random().nextInt(49);
            if(number == 0){
                while(number == 0)
                    number = new Random().nextInt(49);
            } pc_nums[i] = number;
        }
    }
    private static int findMatches(int[] human_nums, int[] pc_nums){
        int matches = 0;

        for(int i = 0; i < human_nums.length; i++){
            for(int x = 0; x < pc_nums.length; x++){
                if(human_nums[x] == pc_nums[i]){
                    matches++;
                }
            }
        } return matches;
    }

}
