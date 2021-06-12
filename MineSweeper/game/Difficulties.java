package MineSweeper.game;

public enum Difficulties {
    Hard(50,30,30),
    Medium(10,20,20),
    Easy(5,10,10),
    Impossible(2499,50,50);


    private final int mines;
    private final int rows;
    private final int cols;
    Difficulties(int mines, int rows, int cols){
        this.mines = mines;
        this.rows = rows;
        this.cols = cols;
    }

    public int getMines() {
        return mines;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
