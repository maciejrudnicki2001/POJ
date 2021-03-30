package pjatk.zadanie;

public enum Weapon {
    NO_WEAPON(1),
    KNIFE(2),
    GUN(5);

    private final int value;

    Weapon(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
