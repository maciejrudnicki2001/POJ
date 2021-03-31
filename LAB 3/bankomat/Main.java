package pjatk.bankomat;

public class Main {
    public static void main(String[] args) {
        Acc[] acc = new Acc[10];
        int i = 0;
        while (i < 10){
            acc[i] = new Acc(i);
            i++;
        }
        CashMachine cashMachine = new CashMachine(acc);
        cashMachine.Loop();
    }
}
