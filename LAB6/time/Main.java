package pjatk.time;

public class Main {
    public static void main(final String[] args) {
        final Time time1 = new Time(1, 2);
        final Time time2 = new Time(3, 4);
        System.out.println(time1);
        System.out.println(time1.addtime(time2));
        System.out.println(time1.multiplier(3));
    }
}
