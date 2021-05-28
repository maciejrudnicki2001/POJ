package pjatk.l11_task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FahrenheitTextFieldActionListener implements ActionListener {

    private final Mediator mediator;

    public FahrenheitTextFieldActionListener(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        try {
            double f = Double.parseDouble(value);
            double result = new Calculate().convertFtoC(f);
            mediator.setC(result);
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, numberFormatException.getMessage(), "INVALID F VALUE", JOptionPane.ERROR_MESSAGE);
        }
    }
}
