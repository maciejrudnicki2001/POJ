package pjatk.SystemPC;

public class Pc {
    private final PcSystem pcSystem;
    private final Kind kind;
    private final boolean on;
    private final int cores;

    public Pc(PcSystem pcSystem, Kind kind, boolean on, int cores) {
        this.pcSystem = pcSystem;
        this.kind = kind;
        this.on = on;
        this.cores = cores;
    }

    public Pc(){
        this.pcSystem = PcSystem.LINUX;
        this.kind = Kind.DESKTOP;
        this.on = true;
        this.cores = 4;
    }

    @Override
    public String toString()
    {
        return "PC{" +
                "pcSystem=" + pcSystem +
                ", kind=" + kind +
                ", on=" + on +
                ", cores=" + cores +
                '}';
    }
    public void informacje()
    {
        System.out.println(this);
    }
}
