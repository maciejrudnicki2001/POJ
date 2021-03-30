package pjatk.zadanie_kwadrat;
public class SquareCalc {
    public static void main(String[] args) {

        Side side = new Side(20);

        System.out.println("Area:" + AreaCalc(side.side));

        System.out.println("Perimeter:" + PerimeterCalc(side.side));

    }
    public static int AreaCalc(int side){
        int area = side * 2;
        return area;
    }
    public static int PerimeterCalc(int side){
        int perimeter = side * 4;
        return perimeter;
    }
}
