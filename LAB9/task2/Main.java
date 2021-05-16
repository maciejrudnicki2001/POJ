package pjatk.task2;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final Player[] players = new Player[]{
                new Player("Maciej", "Rudnicki", 1, 1.0),
                new Player("Piotr", "Wiktorczyk", 2, 2.0),
                new Player("Bartosz", "Wolodzko", 3, 3.0),
                new Player("Ktoś", "Ktosiowski", 4, 4.0),
        };

        Arrays.sort(players, Player::compareTo);

        System.out.println(Arrays.toString(players));

        Comparator comparator = new Comparator();

        Arrays.sort(players, comparator);

        System.out.println(Arrays.toString(players));
    }
}
