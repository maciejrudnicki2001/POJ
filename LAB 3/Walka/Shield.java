package pjatk.zadanie;

public enum Shield {
    NO_SHIELD(1),
    BULLETPROOF_VEST(5);

    private final int value;

    Shield(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}

