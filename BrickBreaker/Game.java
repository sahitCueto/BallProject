import controller.GameController;
import view.GameFrame;
import view.PongCourt;

import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PongCourt court = new PongCourt();
            GameFrame frame = new GameFrame(court);
            new GameController(court);
            court.reset();


        });

    }

}


