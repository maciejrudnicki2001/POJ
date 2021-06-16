package MineSweeper.game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame{
    private JFrame home;
    private int SCREEN_HEIGHT;
    private int SCREEN_WIDTH;

    {resolveScreenSize();}
    {homeScreen();}
    private void  resolveScreenSize(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        SCREEN_HEIGHT = screenSize.height;
        SCREEN_WIDTH = screenSize.width;
    }

    public void homeScreen(){
        home = new JFrame();
        int HEIGHT = 200;
        int WIDTH = 100;
        home.setLocation((SCREEN_WIDTH- WIDTH)/2,(SCREEN_HEIGHT- HEIGHT)/2);
        home.setLayout(new BorderLayout());
        JPanel newHomeScreen = new JPanel(new BorderLayout());
        newHomeScreen.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        JButton easy = new JButton("Easy");
        JButton medium = new JButton("Medium");
        JButton hard = new JButton("Hard");
        JButton impossible = new JButton("Impossible");

        easy.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Minesweeper ms = new Minesweeper(Difficulties.Easy.getMines(),Difficulties.Easy.getRows(), Difficulties.Easy.getCols());
                ms.setVisible(true);
                home.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        medium.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Minesweeper ms = new Minesweeper(Difficulties.Medium.getMines(),Difficulties.Medium.getRows(), Difficulties.Medium.getCols());
                ms.setVisible(true);
                home.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        hard.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Minesweeper ms = new Minesweeper(Difficulties.Hard.getMines(),Difficulties.Hard.getRows(),Difficulties.Hard.getCols());
                ms.setVisible(true);
                home.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        impossible.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Minesweeper ms = new Minesweeper(Difficulties.Impossible.getMines(),Difficulties.Impossible.getRows(), Difficulties.Impossible.getCols());
                ms.setVisible(true);
                home.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonsPanel.setBackground(Color.WHITE);
        buttonsPanel.add(easy);
        buttonsPanel.add(medium);
        buttonsPanel.add(hard);
        buttonsPanel.add(impossible);

        buttonsPanel.repaint();
        newHomeScreen.add(buttonsPanel, BorderLayout.CENTER);

        home.add(newHomeScreen,BorderLayout.CENTER);
        home.setTitle("MineSweeper");
        home.setResizable(false);
        home.pack();
        home.setVisible(true);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
