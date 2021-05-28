package pjatk.l11_task1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusTextFieldActionListener implements ActionListener {
    private final Mediator mediator;

    public CelsiusTextFieldActionListener(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        try {
            double c = Double.parseDouble(value);
            double result = new Calculate().convertCtoF(c);
            mediator.setF(result);
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, numberFormatException.getMessage(), "INVALID C VALUE", JOptionPane.ERROR_MESSAGE);
        }
    }
}
