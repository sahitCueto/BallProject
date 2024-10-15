package Model;


import java.awt.*;

public class Paddle extends GameObject {

    public final static int HEIGHT = 14;
    public final static int WIDTH = 70;


    public Paddle(int courtwidth, int courtheight) {
        super((courtwidth - WIDTH) / 2, courtheight - HEIGHT - HEIGHT, 0, 0, WIDTH, HEIGHT);
        color = Color.BLACK;
    }


    public void accelerate() {
        if (x < 0 || x > rightBound) {
            velocityX = 0;
        }
        if (y < 0 || y > bottomBound) {
            velocityY = 0;
        }
    }


    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
