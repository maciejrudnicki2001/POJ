package pjatk.l11_task3;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class InputPanel extends JPanel {

    private static final TitledBorder TITLED_BORDER = new TitledBorder("Sentence:");
    private static final JTextField TEXT_FIELD = new JTextField(5);

    public InputPanel(Mediator mediator)
    {
        TEXT_FIELD.addActionListener(new InputReverseListener(mediator));
        initalize();
    }

    public void setF(double f)
    {
        TEXT_FIELD.setText(String.valueOf(f));
    }

    private void initalize()
    {
        TITLED_BORDER.setTitleColor(Color.BLACK);
        TITLED_BORDER.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE ));

        setLayout(new GridBagLayout());
        GridBagConstraints gbcPanel = new GridBagConstraints();

        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5, 5, 5, 5);

        add(TEXT_FIELD, gbcPanel);

        setBorder(TITLED_BORDER);
    }
}
