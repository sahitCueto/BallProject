package Model;

import java.awt.*;

public class Ball extends GameObject{
    public final static  int DIAMETER = 10;


    public Ball(int x, int y, int velocityX, int velocityY) {
        super(x, y, velocityX, velocityY, DIAMETER, DIAMETER);
        color = Color.RED;
    }

    @Override
    public void accelerate() {
        if (x < 0) {
            velocityX = Math.abs(velocityX); // Rebote en el límite izquierdo
        } else if (x + DIAMETER > rightBound) {
            velocityX = -Math.abs(velocityX); // Rebote en el límite derecho
        }
        if (y < 0){
            velocityY = Math.abs(velocityY);
        }else if (y > bottomBound){
            //La pelota estará fuera de la pantalla y yo me encargaré de esto en PongCourt.
            //lanzar nueva UnsupportedOperationException("Perdí el juego");
        }
    }

    public void bounce(Intersection i){
        switch (i){
            case NONE:
                break;
            case UP:
                velocityY = -Math.abs(velocityY);
                break;
            case DOWN:
                velocityY = Math.abs(velocityY);
                break;
            case LEFT:
                velocityX = -Math.abs(velocityX);
                break;
            case RIGHT:
                velocityX = Math.abs(velocityX);
                break;
        }
    }

    @Override
    public void move() {
        x += velocityX;
        y += velocityY;
        accelerate();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,DIAMETER,DIAMETER);
    }
}
