package claseteoria;

import javax.swing.JOptionPane;

/**
 *
 * @author Falivene
 */
public class Auto extends Vehiculo {

    public Auto(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void moverArriba() {
        if (!chocado && posY > 0) {
            posY -= 1;
            System.out.println("La posición del auto es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mover");
        }
    }

    @Override
    public void moverDerecha() {
        if (!chocado && posX < 80) {
            posX += 1;
            System.out.println("La posición del auto es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mover");
        }
    }

    @Override
    public void moverIzquierda() {
        if (!chocado && posX > 0) {
            posX -= 1;
            System.out.println("La posición del auto es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mover");
        }
    }

    @Override
    public void moverAbajo() {
        if (!chocado && posY < 22) {
            posY += 1;
            System.out.println("La posición del auto es (X = " + posX + ") | (Y = " + posY + ")");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mover");
        }
    }

    @Override
    public void setChocado(boolean chocado) {
        super.setChocado(chocado); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPosY(int posY) {
        super.setPosY(posY); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPosX(int posX) {
        super.setPosX(posX); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isChocado() {
        return super.isChocado(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getPosY() {
        return super.getPosY(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getPosX() {
        return super.getPosX(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
