package tama.win;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private String title;

    public Window(String title) {
        this.title = title;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(this.title);

        ImageIcon icon = new ImageIcon("res/icon.png");
        this.setIconImage(icon.getImage());

        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
