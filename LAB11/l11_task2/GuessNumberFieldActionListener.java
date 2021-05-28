package pjatk.l11_task2;

import pjatk.l11_task2.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberFieldActionListener implements ActionListener {

    private final Mediator mediator;
    private final Guess guess = new Guess();

    public GuessNumberFieldActionListener(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String value = e.getActionCommand();
        try{
            int n = Integer.parseInt(value);
            String result = guess.checkNum(n);
            mediator.makeAnswer(result);
        } catch (NumberFormatException numberFormatException){
            JOptionPane.showMessageDialog(null,numberFormatException.getMessage(),"Invalid input",JOptionPane.ERROR_MESSAGE);
        }
    }
}
