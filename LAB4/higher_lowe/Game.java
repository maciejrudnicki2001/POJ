package pjatk.higher_lowe;
import java.util.Random;
public class Game {
    private final int liczba;
    private int kolejka;
    private boolean stan;

    Random rand = new Random();
    public Game(int min, int max)
    {
        this.liczba = rand.nextInt(max-min)+min;
        this.stan = true;
        this. kolejka = 0;
    }

    public boolean isStan()
    {
        return stan;
    }

    public int getKolejka()
    {
        return kolejka;
    }
    public String guess(int zgadywanie)
    {
        if (zgadywanie > this.liczba)
        {
            this.kolejka++;
            return "Za duza";
        }
        else if (zgadywanie < this.liczba) {
            this.kolejka++;
            return "Za mala";
        }
        else
        {
            this.stan = false;
            return "Wygrana";
        }
    }
}
