package pjatk.zadanie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class app {
    public static void main(String[] args) {
        Player opponent = new Player(100.0, Shield.NO_SHIELD, Weapon.KNIFE);
        Player me = new Player(100.0, Shield.NO_SHIELD, Weapon.NO_WEAPON);


        do {
            opponent.hit(me.getWeapon().getValue());
            if (me.GetLife() <= 0 || opponent.GetLife() <= 0){
                break;
            }
            me.hit(opponent.getWeapon().getValue());
        } while (me.GetLife() > 0 && opponent.GetLife() > 0);
        System.out.println(opponent.GetLife() > 0 ? "YOU LOST" : "YOU WON");
    }
}

