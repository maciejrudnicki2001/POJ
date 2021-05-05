package pjatk.zad08;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        final Sudent[] student = new Sudent[]{
                new Sudent("Piotr","Wiktorczyk", "s22642"),
                new Sudent("Maciej","Rudnicki","s22983"),
                new Sudent("Ktoś","Ktosiowski", "s21372")

        };

        Arrays.sort(student);
        System.out.println((Arrays.toString(student)));


    }
}
