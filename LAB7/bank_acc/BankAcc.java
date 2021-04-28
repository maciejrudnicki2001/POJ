package pjatk.bank_acc;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class BankAcc {
    private static final String EMPTY = "";
    private static final String MINUS = "-";

    private double balance;
    public BankAcc(final double initialBalance) {
        balance = BigDecimal.valueOf(initialBalance).setScale(2, RoundingMode.HALF_UP).doubleValue();
        printBalance();
    }
    //There could be a problem, and there is exception InsufficientFundsException
    public void transaction(final String value) throws Exception{
        try{
            if (value.startsWith(MINUS)) {
                withdraw(value.replaceFirst(MINUS, EMPTY));
            }
            else {
                deposit(value);
            }

        } catch(NumberFormatException a){
            System.out.println("InsufficientFundsException");
        }

    }
    private void deposit(final String depositAmount) {
        balance += Double.parseDouble(depositAmount);
        printBalance();
    }
    private void withdraw(final String withdrawAmount) {
        balance -= Double.parseDouble(withdrawAmount);
        printBalance();
    }
    private void printBalance() {
        System.out.println("Account has a balance of " + balance);
    }
}
