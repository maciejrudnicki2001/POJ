package pjatk.Telewizor;

public class TV {
    public int volume = 1, channel = 1;
    public boolean on;
    public TV(int volume, int channel, boolean on){
        this.channel = channel;
        this.volume = volume;
        this.on = on;
    }
    int VolumeUp () {
        if (this.volume++ < 20) {
            volume = volume + 1;

        }
        return volume;
    }
    int VolumeDown () {
        if (volume-- > 0) {
            volume = volume - 1;

        }
        return volume;
    }
    int NextChannel () {
        if (channel++ < 20) {
            channel = channel + 1;
        }
        return channel;
    }
    int previousChannel () {
        if (channel-- > 0) {
            channel = channel - 1;
        }
        return channel;
    }


}



