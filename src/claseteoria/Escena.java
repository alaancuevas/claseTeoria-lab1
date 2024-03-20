package claseteoria;

import java.util.Scanner;

public class Escena {
    private Auto auto;
    private Pared pared;

    public Escena(Auto auto) {
        this.auto = auto;
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
                    if (auto.getPosY() > 0) {
                        auto.moverArriba();
                    } else {
                        System.out.println("Chocaste con el limite.");
                    }
                    break;
                case 'a':
                    if (auto.getPosX() > 0) {
                        auto.moverIzquierda();
                    } else {
                        System.out.println("Chocaste con el limite.");
                    }
                    break;
                case 's':
                    if (auto.getPosY() < 22) {
                        auto.moverAbajo();
                    } else {
                        System.out.println("Chocaste con el limite.");
                    }
                    break;
                case 'd':
                    if (auto.getPosX() < 80) {
                        auto.moverDerecha();
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
            if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                auto.setChocado(true);
                System.out.println("CHOCASTE LA PARED!");
            }

        } while (mover != 'e');
    }

    public void setAuto(Auto nuevoAuto) {
        this.auto = nuevoAuto;
    }
}
