package pjatk.fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
    }

    private int gcd(int n1, int n2)
    {
        if(n2 == 0)
        {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    public Fraction sum(Fraction fraction2) {
        int denom1 = this.denominator * fraction2.denominator;
        int numer = (this.numerator * fraction2.denominator) + (fraction2.numerator * this.denominator);
        return new Fraction(numer, denom1);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                + numerator + " / "
                + denominator +
                '}';
    }

    public Fraction substration(Fraction fraction2)
    {
        int denom1 = this.denominator * fraction2.denominator;
        int numer = (this.numerator * fraction2.denominator) - (fraction2.numerator * this.denominator);
        return new Fraction(numer, denom1);
    }

    public Fraction multiply(Fraction fraction2)
    {
        int denom1 = this.denominator * fraction2.denominator;
        int numer = this.numerator * fraction2.numerator;
        return new Fraction(numer, denom1);
    }
    public Fraction divison(Fraction fraction)
    {
        Fraction fraction2 = fraction.reverse();
        int denom1 = this.denominator * fraction2.denominator;
        int numer = this.numerator * fraction2.numerator;
        return new Fraction(numer, denom1);
    }
    public Fraction reverse()
    {
        Fraction reversed = new Fraction(this.denominator, this.numerator);
        return reversed;

    }
}
