package pjatk.moneta;
import javax.print.attribute.standard.Sides;
import java.util.Random;
public class Simulation {


    public void coin_tossing(int how_many_toss){
        double counter = 0;
        double counter2 = 0;
        Random r = new Random();
        Coin newCoin = new Coin();
        String[] Sides = newCoin.getSides();

        for(int i = 0; i < how_many_toss; i++){
            int randomSide = r.nextInt(Sides.length);
            System.out.println(Sides[randomSide]);
            if (randomSide == 0){
                counter++;
            }
            else{
                counter2++;
            }
        }
        double percent1 = (counter/how_many_toss)*100;
        double percent2 = (counter2/how_many_toss)*100;
        System.out.println("Heads:" + percent1 + "Tails:" + percent2);
    }
}
