package pjatk.SystemPC;

public class Main {
    public static void main(String[] args) {
        Pc defaultPc = new Pc();
        Pc customPc = new Pc(PcSystem.WINDOWS, Kind.NOTEBOOK, false, 8);

        defaultPc.informacje();
        customPc.informacje();

    }
}
