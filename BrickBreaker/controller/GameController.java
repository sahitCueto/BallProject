package controller;

import view.PongCourt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {
    private PongCourt court;

    public GameController(PongCourt court) {
        this.court = court;
        setupResetButton();
        setupInfoButton();
    }

    private void setupResetButton() {
        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                court.reset();
            }
        });
        court.add(reset);
    }

    private void setupInfoButton() {
        JButton info = new JButton("Info");
        info.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(court, "Use the arrow keys to move...", "Information", JOptionPane.INFORMATION_MESSAGE);
                court.requestFocusInWindow();
            }
        });
        court.add(info);
    }
}

