/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseteoria;

/**
 *
 * @author Carlitos
 */
public class Pared {

    private int posX;
    private int posY;

    public Pared() {
        posX = (int) (Math.random() * 80) / 5 * 5;
        posY = (int) (Math.random() * 22) / 5 * 5;
        System.out.println("-----------------------------------------------------");
        System.out.println("Posición de la PARED es (X = " + posX + " a " + (posX + 5) + ") | (Y = " + posY + " a "
                + (posY + 5) + ")");
        System.out.println("-----------------------------------------------------");
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

}