package pjatk.date;
import java.text.DateFormatSymbols;
public class Date {
    private final int days;
    private final int months;
    private final int years;

    public Date(final int days, final int months, final int years){
        this.days = days;
        this.months = months;
        this.years = years;
    }
    public String toString() {
        return this.days +"."+ this.months +"."+ this.years;
    }
    public String toString1() {
        return this.days+" "+  new DateFormatSymbols().getMonths()[this.months - 1]+" "+ this.years;
    }
}
