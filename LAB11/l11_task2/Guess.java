package pjatk.l11_task2;

import java.util.Random;

public class Guess {
    private final static Random random = new Random();
    private final static int randNum = random.nextInt(40-1)+1;

    public String checkNum(int guessNum){
        if (guessNum > randNum){
            return "Lower";
        }
        else if (guessNum == randNum){
            return "U won";
        }
        else {
            return "Higher";
        }
    }
}
