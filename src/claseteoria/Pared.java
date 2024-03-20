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
        posX=(int)(Math.random()*75);
        posY=(int)(Math.random()*17);
        System.out.println("-------------------------------------");
        System.out.println("Posicion de la PARED (X,Y) ("+posX+" , ("+posY+")");
        System.out.println("-------------------------------------");
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }


}
