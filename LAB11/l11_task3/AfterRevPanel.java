package pjatk.l11_task3;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
public class AfterRevPanel extends JPanel {
    private static final TitledBorder TITLED_BORDER = new TitledBorder("Rev Sent");
    private static final JLabel LABEL = new JLabel("I will rev ur sent");


    public AfterRevPanel(Mediator mediator){
        initialize();
    }

    public void setAnswer(String a){
        LABEL.setText(String.valueOf(a));
    }

    private void initialize(){
        TITLED_BORDER.setTitleColor(Color.BLACK);
        TITLED_BORDER.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLUE));

        setLayout(new GridBagLayout());
        GridBagConstraints gbcPanel = new GridBagConstraints();

        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5, 5, 5, 5);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 0;
        add(LABEL, gbcPanel);


        setBorder(TITLED_BORDER);
    }
}
