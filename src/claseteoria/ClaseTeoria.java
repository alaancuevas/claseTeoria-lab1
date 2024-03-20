/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseteoria;

/**
 *
 * @author Carlitos
 */
public class ClaseTeoria {

    public static void main(String[] args) {
        Vehiculo fitito = new Vehiculo(2, 10);
        Escena miEscena = new Escena(fitito);
        miEscena.Jugar();
        miEscena.setVehiculo(fitito);
    }

}
