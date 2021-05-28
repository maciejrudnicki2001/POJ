package pjatk.l11_task1;

public class Calculate {

    public double convertCtoF(double c)
    {
        return Math.round(c/5*9+32);
    }

    public double convertFtoC(double f)
    {
        return Math.round((f-32)*5/9);
    }
}
