package pjatk.task2;

public  class Comparator implements java.util.Comparator<Player> {
    @Override
    public int compare(final Player p1, final Player p2) {
        return p1.ranking.compareTo(p2.ranking);
    }
}
