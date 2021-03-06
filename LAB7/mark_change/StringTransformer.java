package pjatk.mark_change;

public class StringTransformer {
    public String removeSigns(String sentence, Sign sign){
        return sentence.replaceAll("["+sign.toString()+"]","");
    }

    public String replaceSigns(String sentence, Sign sign, String replace){
        return sentence.replaceAll("["+sign.toString()+"]",replace);
    }

    public String preserveSigns(String sentence, Sign sign){
        String allSigns = sign.allSigns();
        allSigns = allSigns.replaceAll("["+sign.toString()+"]","");
        return sentence.replaceAll("["+allSigns+"]","");

    }
}
