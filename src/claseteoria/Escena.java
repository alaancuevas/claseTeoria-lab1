package claseteoria;

import java.util.Scanner;

public class Escena {
    private Vehiculo vehiculo;
    private Pared pared;

    public Escena(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.pared = new Pared();
    }

    public void Jugar() {
        Scanner scanner = new Scanner(System.in);
        char mover;

        do {
            System.out.print("Instrucciones: (W - Arriba, A - Izquierda, S - Abajo, D - Derecha, E - Salir): ");
            mover = Character.toLowerCase(scanner.next().charAt(0));

            switch (mover) {
                case 'w':
                    if (vehiculo.getPosY() - vehiculo.getSpeed() >= 0) {
                        vehiculo.moverArriba();
                    } else {
                        System.out.println("Chocaste con el limite.");
                    }
                    break;
                case 'a':
                    if (vehiculo.getPosX() - vehiculo.getSpeed() > 0) {
                        vehiculo.moverIzquierda();
                    } else {
                        System.out.println("Chocaste con el limite.");
                    }
                    break;
                case 's':
                    if (vehiculo.getPosY() + vehiculo.getSpeed() < 22) {
                        vehiculo.moverAbajo();
                    } else {
                        System.out.println("Chocaste con el limite.");
                    }
                    break;
                case 'd':
                    if (vehiculo.getPosX() + vehiculo.getSpeed() < 80) {
                        vehiculo.moverDerecha();
                    } else {
                        System.out.println("Chocaste con el limite.");
                    }
                    break;
                case 'e':
                    System.out.println("Juego terminado.");
                    break;
                default:
                    System.out.println("------------------------------------------");
                    System.out.println("Movimiento no válido, intenta nuevamente..");
                    System.out.println("------------------------------------------");
                    break;
            }

            if (vehiculo.getPosX() >= pared.getPosX() && vehiculo.getPosX() <= pared.getPosX() + 5 &&
                    vehiculo.getPosY() >= pared.getPosY() && vehiculo.getPosY() <= pared.getPosY() + 5) {

                System.out.println("CHOCASTE LA PARED!");

                vehiculo.setChocado(true);
            }

        } while (mover != 'e');
    }

    public void setVehiculo(Vehiculo nuevoAuto) {
        this.vehiculo = nuevoAuto;
    }
}
