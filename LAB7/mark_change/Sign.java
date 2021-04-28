package pjatk.mark_change;


public enum Sign {
    CONSONANT("bcdfgjklmnpqstvxzhrwy"),
    VOWEL("aąeęioóu"),
    SPACE(" "),
    NUMBER("1234567890");

    private final String sign;

    Sign(String sign){
        this.sign=sign;
    }

    @Override
    public String toString() {
        return String.valueOf(sign);
    }

    public String allSigns(){
        return CONSONANT.toString()+VOWEL.toString()+SPACE.toString()+NUMBER.toString();
    }
}
