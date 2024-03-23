package claseteoria;

/**
 *
 * @author Carlitos
 */
public class ClaseTeoria {

    public static void main(String[] args) {
        Vehiculo fitito = new Camion(40, 11);
        Escena miEscena = new Escena(fitito);
        miEscena.Jugar();
        miEscena.setVehiculo(fitito);
    }

}
