package TEST;

import CLASS.punto;
import java.util.Scanner;

public class tespunto {

    public static void main(String[] args) {
        punto p;
        Scanner e = new Scanner(System.in);
        int a;
        p = new punto();
        do {
            System.out.println("------El punnto inicial esta ubicado en 0;0------");
            System.out.println("Regla: Los numeros ingresados solo pueden ser positivos incluido el 0");
            System.out.println("Que desea hacer:");
            System.out.println("1.-Mover al punto.");
            System.out.println("2.-Mostrar la posicion del punto punto con respecto al punto 0;0.");
            System.out.println("3.-Salir.");
            a = e.nextInt();
            switch (a) {
                case 1:
                    mover(p);
                    break;
                case 2:
                    mostrar(p);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;

            }

        } while (a != 3);

    }

    public static void mover(punto p) {
        int x, y, a, b = 0, c, d, g = 0;
        double f;
        Scanner e = new Scanner(System.in);
        System.out.println("Escriba el numero deveces que quiere moverle:");
        c = e.nextInt();
        do {
            a = 0;
            if (c < 1) {
                System.out.println("Los numero deben ser mayor a 0;");
                System.out.println("Ingrese otro numero:");
                c = e.nextInt();
            } else {
                a = 1;
            }
        } while (a != 1);
        do {
            System.out.println("Escriba el numero de esapcios que quiere mover:");
            d = e.nextInt();
            do {
                a = 0;
                if (d < 0) {
                    System.out.println("Los numero deben ser positivos;");
                    System.out.println("Ingrese otro numero:");
                    d = e.nextInt();
                } else {
                    a = 1;
                }
            } while (a != 1);
            g = g + d;
            f = Math.random() * 4 + 1;
            if (f > 1) {
                if (f < 2) {
                    x = p.getX() + d;
                    p.setX(x);
                    System.out.println("El punto esta en la posicion." + p.mostrar());
                    System.out.println("El punto se ha movido: " + d + "para la derecha.");
                }
            }
            if (f > 2) {
                if (f < 3) {
                    x = p.getX() - d;
                    p.setX(x);
                    System.out.println("El punto esta en la posicion." + p.mostrar());
                    System.out.println("El punto se ha movido: " + d + "para la izquierda.");
                }
            }
            if (f > 3) {
                if (f < 4) {
                    y = p.getY() + d;
                    p.setY(y);
                    System.out.println("El punto esta en la posicion." + p.mostrar());
                    System.out.println("El punto se ha movido: " + d + "para arriba.");
                }
            }
            if (f > 4) {
                if (f < 5) {
                    y = p.getY() - d;
                    p.setY(y);
                    System.out.println("El punto esta en la posicion." + p.mostrar());
                    System.out.println("El punto se ha movido: " + d + "para abajo.");
                }
            }
            b++;
        } while (b != c);
        System.out.println("La distancia total que se ha movido es:");
        System.out.println(g);
        System.out.println(f);
    }

    public static void mostrar(punto p) {
        if (p.getX() == 0) {
            if (p.getY() == 0) {
                System.out.println("El punto esta en la posicion." + p.mostrar() + "\nEL punto no se ha movido.");
            }
        }
        if (p.getX() < 0) {
            System.out.println("El punto esta en la posicion." + p.mostrar() + "\nEL punto se ha movido " + p.getX() + " a la izquierda.");
        }
        if (p.getX() > 0) {
            System.out.println("El punto esta en la posicion." + p.mostrar() + "\nEL punto se ha movido " + p.getX() + " a la derecha.");
        }
        if (p.getY() < 0) {
            System.out.println("El punto esta en la posicion." + p.mostrar() + "\nEL punto se ha movido " + p.getY() + " para abajo.");
        }
        if (p.getY() > 0) {
            System.out.println("El punto esta en la posicion." + p.mostrar() + "\nEL punto se ha movido " + p.getY() + " para arriba.");
        }
    }
}