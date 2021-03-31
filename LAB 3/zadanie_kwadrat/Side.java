package pjatk.zadanie_kwadrat;

public class Side {
    
        int side;

        Side(int a) {
            side = a;
        }

    public static int AreaCalc(int side){
        int area = side * side;
        return area;
    }
    public static int PerimeterCalc(int side){
        int perimeter = side * 4;
        return perimeter;
    }


}
