package pjatk.bankomat;
import java.util.Scanner;
public class CashMachine {
    public final Scanner scanner = new Scanner(System.in);
    public final Acc[] acc;

    public CashMachine(Acc[] acc) {
        this.acc = acc;
    }
    public String menu(){
        return ("Hi User" + "\n" + "Press 1 to : check balance" + "\n" + "Press 2 to : withdraw money" + "\n" + "Press 3 to : deposit money" + "\n" + "Press 4 to : exit");
    }


    private Acc getaccount(int id) {
        for (Acc account : this.acc) {
            if (account.getid() == id) return account;
        }

        System.out.println("Wrong ID");
        return null;
    }

    private void deposit(Acc acc) {
        System.out.println("How much money would you like to deposit:  ");
        double deposit = this.scanner.nextFloat();
        acc.deposit(deposit);
    }

    private void withdraw(Acc acc) {
        System.out.println("How much money would you like to withdraw:  ");
        float withdraw = this.scanner.nextFloat();
        if (acc.withdraw(withdraw)) {
            System.out.println("Success");
        } else {
            System.out.println("You don't have enough money");
        }
    }

    private void checkbalance(Acc acc) {
        System.out.println("You have: " + acc.getmoney() + "PLN");
    }
    public void Loop() {
        while (true) {

            System.out.println("ID: ");
            int id = this.scanner.nextInt();
            Acc account = this.getaccount(id);
            if (account == null) continue;

            boolean start = false;
            System.out.println(menu());
            while (!start) {
                switch(scanner.nextInt()) {
                    default:
                        System.out.println("Pls give correct number");
                        System.out.println(menu());
                        break;
                    case 1:
                        this.checkbalance(account);
                        System.out.println(menu());
                        break;
                    case 2:
                        this.withdraw(account);
                        System.out.println(menu());
                        break;
                    case 3:
                        this.deposit(account);
                        System.out.println(menu());
                        break;
                    case 4:
                        start = true;
                        break;

                }
            }
        }
    }
}
