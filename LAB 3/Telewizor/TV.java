package pjatk.Telewizor_niedokonczone;

public class TV {

    int channel;
    int volume;
    boolean on;

    public TV(int volume, int channel, boolean on) {
        this.channel = channel;
        this.volume = volume;
        this.on = on;
    }
    public String info() {
        return ("Channel:" + channel +"\n" + "Volume:" + volume +"\n" +"Status:" + on);


    }
}



