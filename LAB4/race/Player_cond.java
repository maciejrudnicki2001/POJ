package pjatk.race;
import java.util.Random;
public class Player_cond {
    private Player player;

    public Player_cond(Player player){
        this.player = player;

    }
    public String tell_name(){
        return player.getName();
    }
    public void tell_smth(){
        System.out.println("Nazywam się:\t" + player.getName() + "\tMoja maksymalna i minimalna prędkośc na godzine to:\t" + player.getMin_speed()+"/"+ player.getMax_speed());
    }
    public void win(){
        System.out.println("Wygral:" + player.getName());
    }
    public int speed(){
        Random rand = new Random();
        int distance = (rand.nextInt(player.getMax_speed()-player.getMin_speed())+player.getMin_speed());
        return distance;
    }

}
