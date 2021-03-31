package pjatk.zadanie_kwadrat;

public class Side {
    
        int side;

        Side(int a) {
            side = a;
        }

    public static int areacalc(int side){
        int area = side * side;
        return area;
    }
    public static int perimetercalc(int side){
        int perimeter = side * 4;
        return perimeter;
    }


}
