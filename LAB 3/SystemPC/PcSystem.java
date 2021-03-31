package pjatk.SystemPC;

public enum PcSystem {
    MAC_OS("Big sur"),
    WINDOWS("10"),
    LINUX("Kali");

    private final String version;

    PcSystem(String version){
        this.version = version;
    }

    public String getVersion(){
        return version;
    }
}
