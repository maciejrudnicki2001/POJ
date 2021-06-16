package MineSweeper.game;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Minesweeper extends JFrame {

    public Minesweeper(int mines, int rows,int cols) {
        initializeWindow(mines, rows, cols);
    }

    public void initializeWindow(int mines, int rows, int cols){
        JLabel status = new JLabel("");
        add(status, BorderLayout.SOUTH);
        add(new Board(status, mines,rows,cols));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Menu();
    }
}
