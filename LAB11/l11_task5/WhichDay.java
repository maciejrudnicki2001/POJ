package pjatk.l11_task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;

public class WhichDay {
    private static final JFrame mainFrame = new JFrame();
    private static final JPanel panel = new JPanel();

    private final JLabel label = new JLabel("YYYY/MM/DD");
    private final JTextField textField = new JTextField("", 8);

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    private static int SCREEN_HEIGHT;
    private static int SCREEN_WIDTH;

    {
        resolveScreenSize();
        initializePanel();
        initializeFrame();
    }

    private void resolveScreenSize()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        SCREEN_HEIGHT = screenSize.height;
        SCREEN_WIDTH = screenSize.width;
    }
    private void initializePanel()
    {
        panel.add(label, gbc(3, 3, 3));
        textField.addActionListener(this::date);
        panel.add(textField, gbc(3, 3, 3));
    }
    private void initializeFrame()
    {
        mainFrame.setTitle("The day from the date ");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH/3, SCREEN_HEIGHT/3);
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
    private void date(ActionEvent e) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.ENGLISH);
        try {
            LocalDate localDate = LocalDate.parse(e.getActionCommand(), dateTimeFormatter);
            JOptionPane.showMessageDialog(null,"The day is \t" + localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        } catch (DateTimeParseException parseException) {
            JOptionPane.showMessageDialog(null, parseException.getMessage(), "Input correct date!", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static GridBagConstraints gbc(int x, int y, int gwidth) {
        GridBagConstraints gbcPanel = new GridBagConstraints();
        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5, 5, 5, 5);
        return gbcPanel;
    }
}
