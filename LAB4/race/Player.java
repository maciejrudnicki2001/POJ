package pjatk.race;

public enum Player {
    ADAM ("Adam", 5, 12),
    SEBA ("Seba", 3, 15),
    KRZYSZTOF ("Krzysiek", 7, 13);

    private final String name;
    private final int min_speed;
    private final int max_speed;


    Player(String name, int min_speed, int max_speed){
        this.name = name;
        this.min_speed = min_speed;
        this.max_speed = max_speed;
    }
    public String getName(){
        return name;
    }
    public int getMin_speed(){
        return min_speed;
    }
    public int getMax_speed(){
        return  max_speed;
    }
}
