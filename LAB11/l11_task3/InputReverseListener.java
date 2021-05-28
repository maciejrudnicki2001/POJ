package pjatk.l11_task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputReverseListener implements ActionListener {
    private final Mediator mediator;

    public InputReverseListener(Mediator mediator){
        this.mediator=mediator;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String value = e.getActionCommand();
        StringBuilder reverseValue = new StringBuilder();
        reverseValue.append(value).reverse();
        mediator.setAnswer(reverseValue.toString());
    }
}
