package claseteoria;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlitos
 */
public abstract class Vehiculo {

    public static final int LIMIT_X = 80;
    public static final int LIMIT_Y = 22;

    protected int posX;
    protected int posY;
    protected boolean chocado;
    protected int speed;

    public Vehiculo(int posX, int posY, int speed) {
        this.posX = posX;
        this.posY = posY;
        this.speed = speed;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isChocado() {
        return chocado;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setChocado(boolean chocado) {
        this.chocado = chocado;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void moverArriba() {
        if (!chocado && posY > 0) {
            setPosY(getPosY() - speed);
            System.out.println("La posición del vehículo es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            System.out.println("Chocaste con el limite.");
        }
    }

    public void moverAbajo() {
        if (!chocado && posY < LIMIT_Y - speed) {
            setPosY(getPosY() + speed);
            System.out.println("La posición del vehículo es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            System.out.println("Chocaste con el limite.");
        }
    }

    public void moverDerecha() {
        if (!chocado && posX < LIMIT_X) {
            setPosX(getPosX() + speed);
            System.out.println("La posición del vehículo es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            System.out.println("Chocaste con el limite.");
        }
    }

    public void moverIzquierda() {
        if (!chocado && posX > 0) {
            setPosX(getPosX() - speed);
            System.out.println("La posición del vehículo es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            System.out.println("Chocaste con el limite.");
        }
    }

}