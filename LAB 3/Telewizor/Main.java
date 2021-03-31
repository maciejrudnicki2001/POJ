package pjatk.Telewizor_niedokonczone;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(1,1,true);
        Remote remote = new Remote(tv);
        remote.nextChannel();
        System.out.println(tv.info());

    }
}

