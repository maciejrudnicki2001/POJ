package pjatk.zadanie;

public class Player {
    private double life;
    private Shield shield;
    private Weapon weapon;

    public Player(Double life, Shield shield, Weapon weapon){
        this.life = life;
        this.shield = shield;
        this.weapon = weapon;
    }
    public void hit(double strength){
        double power = strength / this.shield.getValue();
        this.life = this.life - (power == 0 ? strength : power);
    }
    public double GetLife(){
        return life;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public String toString(){
        return "Player("+
                "Life="+ life +
                ", shield="+ shield +
                ", weapon=" + weapon  +
                ")";

    }
}

