package pjatk.l11_task3;

import javax.swing.*;
import java.awt.*;

public class Reverse  {
    private static final JFrame mainFrame = new JFrame();
    private static final JPanel panel = new JPanel();

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    private static int SCREEN_HEIGHT;
    private static int SCREEN_WIDTH;

    private final Mediator mediator = new Mediator();
    public Reverse()
    {

    }

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
    private void initializePanel(){
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbcPanel=new GridBagConstraints();
        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5,5,5,5);

        AfterRevPanel afterRevPanel = new AfterRevPanel(mediator);
        panel.add(afterRevPanel, gbcPanel);
        gbcPanel.gridx=2;
        gbcPanel.gridy=2;
        gbcPanel.gridwidth=2;
        gbcPanel.gridheight=2;

        InputPanel inputPanel = new InputPanel(mediator);
        panel.add(inputPanel, gbcPanel);

        mediator.register(inputPanel);
        mediator.register(afterRevPanel);
    }
    private void initializeFrame()
    {
        mainFrame.setTitle("Numbers");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH/3, SCREEN_HEIGHT/3);
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}
