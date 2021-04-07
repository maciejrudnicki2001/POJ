package pjatk.race;

public class Race {
    public  Player_cond pl1 =  new Player_cond(Player.ADAM);
    public  Player_cond pl2 =  new Player_cond(Player.SEBA);
    public  Player_cond pl3 = new Player_cond(Player.KRZYSZTOF);

    public void start(){

        int pl1_dist = 0;
        int pl2_dist = 0;
        int pl3_dist = 0;
        pl1.tell_smth();
        pl2.tell_smth();
        pl3.tell_smth();
        while (pl1_dist < 50 && pl2_dist < 50 && pl3_dist < 50){
            pl1_dist = pl1_dist + pl1.speed();
            System.out.println(pl1.tell_name() + "\tprzebiegł\t" + pl1_dist);
            pl2_dist = pl2_dist + pl2.speed();
            System.out.println(pl2.tell_name() + "\tprzebieg\t" + pl2_dist);
            pl3_dist = pl3_dist + pl3.speed();
            System.out.println(pl3.tell_name() + "\tprzebiegł\t" + pl3_dist);
        }
        if (pl1_dist >= 50){
            pl1.win();
        }
        else if (pl2_dist >= 50){
            pl2.win();
        }
        else{
            pl3.win();
        }

        }
}




