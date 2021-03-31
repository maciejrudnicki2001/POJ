package pjatk.wspolrzedne;

public class Coordinates {

    int x;
    int y;

    public Coordinates() {
        this.x = 0;
        this.y = 0;
    }
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int xValue(){
        return this.x;
    }
    public int yValue(){
        return this.y;
    }
    public double Length(int x2, int y2){
        double length = Math.sqrt(Math.pow((double)this.x - (double)x2, 2) + Math.pow((double)this.y - (double)y2, 2));
        return length;
    }
    String Location(){
        return("X is located:" + this.xValue() +"\n" + "Y is located:" + this.yValue());
    }



}
