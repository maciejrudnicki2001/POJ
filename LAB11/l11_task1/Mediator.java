package pjatk.l11_task1;

public class Mediator {

    private CelsiusPanel celsiusPanel;
    private FahrenheitPanel fahrenheitPanel;

    public void register(CelsiusPanel celsiusPanel)
    {
        this.celsiusPanel = celsiusPanel;
    }

    public void register(FahrenheitPanel fahrenheitPanel)
    {
        this.fahrenheitPanel = fahrenheitPanel;
    }

    public void setC(double c)
    {
        this.celsiusPanel.setC(c);
    }
    public void setF(double f)
    {
        this.fahrenheitPanel.setF(f);
    }
}
