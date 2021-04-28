package pjatk.bank_acc;

import java.util.Scanner;

public class Main {
    private static final String EXIT = "exit";
    private final static BankAcc account = new BankAcc(Math.random() * 10000);
    public static void main(final String[] args) throws Exception{
        final Scanner in = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            final String line = in.nextLine();
            if (EXIT.equals(line)) {
                isExit = true;
            }
            else {
                account.transaction(line);
            }
        }
    }
}
}
