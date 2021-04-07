package pjatk.higher_lowe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner wczytywanie = new Scanner(System.in);
        Game nowa = new Game(1,100);
        while (nowa.isStan() && nowa.getKolejka()!=5)
        {
            System.out.println(nowa.guess(wczytywanie.nextInt()));
        }
    }
}
