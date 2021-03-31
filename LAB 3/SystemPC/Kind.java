package pjatk.SystemPC;

public enum Kind {
    DESKTOP(1),
    NOTEBOOK(2);

    private final int kind;

    Kind(int kind){
        this.kind = kind;
    }

    public int getVersion(){
        return kind;
    }
}
