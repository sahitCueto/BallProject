package view;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame(PongCourt court) {
        setTitle("Breakout!");
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(court, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
}

