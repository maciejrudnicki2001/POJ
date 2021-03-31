package pjatk.wspolrzedne;

public class CoordCalc {
    public static void main(String[] args) {

        Coordinates coords1 = new Coordinates(5,20);
        System.out.println(coords1.Location());
        Coordinates coords2 = new Coordinates(24,23);
        System.out.println(coords2.Location());
        System.out.println(coords1.Length(coords2.xValue(),coords2.yValue()));


    }
}
