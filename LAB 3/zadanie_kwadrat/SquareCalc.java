package pjatk.zadanie_kwadrat;
public class SquareCalc {
    public static void main(String[] args) {

        Side side = new Side(20);

        System.out.println("Area:" + Side.AreaCalc(side.side));

        System.out.println("Perimeter:" + Side.PerimeterCalc(side.side));

    }


}
