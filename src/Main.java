import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        System.out.printf("BIENVENIDO A TU ALCANCIA");
        System.out.printf("\nSelecciona una opcion del menu");

        while (opcion != 5) {
            System.out.printf("\n1- Agregar monedas");
            System.out.printf("\n2- Contar monedas");
            System.out.printf("\n3- Total ahorrado");
            System.out.printf("\n4- Romper alcancia");
            System.out.printf("\n5- Salir");


            int mon20, mon50, mon100, mon200, mon500;
            mon20 = 0;
            mon50 = 0;
            mon100 = 0;
            mon200 = 0;
            mon500 = 0;


            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Agregar monedas");
                    System.out.printf("\nSeleccione la denominacion a depositar");
                    System.out.printf("\n1- 20");
                    System.out.printf("\n2- 50");
                    System.out.printf("\n3- 100");
                    System.out.printf("\n4- 200");
                    System.out.printf("\n5- 500");
                    int den;
                    den = teclado.nextInt();
                    switch (den) {
                        case 20:
                            mon20++;
                            break;
                        case 50:
                            mon50++;
                            break;
                        case 100:
                            mon100++;
                            break;
                        case 200:
                            mon200++;
                            break;
                        case 500:
                            mon500++;
                            break;
                    }

                    break;
                case 2:
                    System.out.printf("Contar monedas");
                    System.out.printf("\nLa cantidad de monedas de $20 es: "+ mon20);
                    System.out.printf("\nLa cantidad de monedas de $50 es: "+ mon50);
                    System.out.printf("\nLa cantidad de monedas de $100 es: "+ mon100);
                    System.out.printf("\nLa cantidad de monedas de $200 es: "+ mon200);
                    System.out.printf("\nLa cantidad de monedas de $500 es: "+ mon500);
                    break;
                case 3:
                    System.out.printf("Total ahorrado");
                    break;
                case 4:
                    System.out.printf("Romper alcancia");
                    break;
                case 5:
                    System.out.printf("Saliendo de el programa");
                    break;
                default:
                    System.out.printf("Opcion invalida");
            }
        }
    }
}