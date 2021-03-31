package pjatk.Telewizor_niedokonczone;

public class Remote {
    TV telewizor;
    public Remote(TV telewizor){
        this.telewizor = telewizor;
    }
    public void statusChange(boolean changeStatus){
        if (telewizor.on = true){
            telewizor.on = false;
        }
        else{
            telewizor.on = true;
        }
    }
    public void nextChannel(){
        if(telewizor.on){
            if(telewizor.channel + 1 <= 20){
                telewizor.channel += 1;
            }
        }
    }
    public void previousChannel(){
        if(telewizor.on){
            if(telewizor.channel - 1 >= 1){
                telewizor.channel -= 1;
            }
        }
    }
    public void volumeUp(){
        if(telewizor.on){
            if(telewizor.volume + 1 <= 20){
                telewizor.volume += 1;
            }
        }
    }
    public void volumeDown(){
        if(telewizor.on){
            if(telewizor.volume - 1 >= 1){
                telewizor.volume -= 1;
            }
        }
    }
}
