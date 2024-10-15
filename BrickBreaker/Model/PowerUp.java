package Model;


import java.awt.Graphics;


public abstract class PowerUp extends GameObject {

    final public static int DIAMETER = 15;


    public PowerUp(int x, int y, int velocityX, int velocityY) {
        super(x, y, 0, (int)(Math.random() * 6) + 4, DIAMETER, DIAMETER/2);

    }


    @Override
    public void accelerate() {
    }


    public void move(){
        y += velocityY;
        x += velocityX;
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, DIAMETER, DIAMETER/2);
    }


    private static PowerUp[] powerUpOptions(int x, int y) {
        return new PowerUp[]
                {new SmallPaddlePowerUp(x, y), new BigPaddlePowerUp(x, y),
                        new OneUpPowerUp(x, y), new BronzeBallPowerUp(x, y),
                        new MultiBallPowerUp(x, y)};

    }


    public static PowerUp randomPowerUp(int x, int y) {
        PowerUp[] options = powerUpOptions(x, y);
        return options[(int)(Math.random() * options.length)];
    }
}

