package pjatk.date;


public class Date {
    private final int days;
    public final int months;
    private final int years;


    public Date(final int days, final int months, final int years) {
        this.days = days;
        this.months = months;
        this.years = years;

    }

    //@Override
    //public String toString() {
      //  return (this.days+"."+ this.months+"."+ this.years);
    //}


    @Override
    public String toString() {
        final Month month = new Month(this.months);
        return (this.days+"\t"+ month +this.years);
    }
}
