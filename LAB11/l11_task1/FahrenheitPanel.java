package pjatk.l11_task1;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FahrenheitPanel extends JPanel {

    private static final TitledBorder TITLED_BORDER = new TitledBorder("Farenheit");
    private static final JLabel LABEL = new JLabel("F");
    private static final JTextField TEXT_FIELD = new JTextField(5);

    public FahrenheitPanel(Mediator mediator)
    {
        TEXT_FIELD.addActionListener(new FahrenheitTextFieldActionListener(mediator));
        initalize();
    }

    public void setF(double f)
    {
        TEXT_FIELD.setText(String.valueOf(f));
    }

    private void initalize()
    {
        TITLED_BORDER.setTitleColor(Color.BLACK);
        TITLED_BORDER.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE ));

        setLayout(new GridBagLayout());
        GridBagConstraints gbcPanel = new GridBagConstraints();

        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5, 5, 5, 5);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 0;
        add(LABEL, gbcPanel);

        gbcPanel.gridx = 1;
        gbcPanel.gridy = 0;
        add(TEXT_FIELD, gbcPanel);

        setBorder(TITLED_BORDER);
    }
}
