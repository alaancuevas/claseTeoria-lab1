package claseteoria;

/**
 *
 * @author Carlitos
 */
public class ClaseTeoria {

    public static void main(String[] args) {
        Vehiculo fitito = new Auto(2, 10);
        Escena miEscena = new Escena(fitito);
        miEscena.Jugar();
        miEscena.setVehiculo(fitito);
    }

}
