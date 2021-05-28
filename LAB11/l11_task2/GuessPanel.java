package pjatk.l11_task2;



import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GuessPanel extends JPanel {

    private static final TitledBorder TITLED_BORDER = new TitledBorder("Input Number");
    private static final JTextField TEXT_FIELD = new JTextField(5);

    public GuessPanel(Mediator mediator)
    {
        TEXT_FIELD.addActionListener(new GuessNumberFieldActionListener(mediator));
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
