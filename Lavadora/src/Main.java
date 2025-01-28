import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora(6, "Rápido");
        Lavadora lavadora2 = new Lavadora(8, "Intenso");
        Lavadora lavadora3 = new Lavadora(6, "Ecológico");

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Abrir puerta");
            System.out.println("2. Cerrar puerta");
            System.out.println("3. Añadir prenda");
            System.out.println("4. Añadir detergente");
            System.out.println("5. Iniciar lavado");
            System.out.println("6. Retirar ropa");
            System.out.println("7. Apagar lavadora");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            Lavadora lavadora = null;

            if (opcion >= 1 && opcion <= 7) {
                System.out.print("Seleccione lavadora (1, 2, 3): ");
                int lavadoraSeleccionada = scanner.nextInt();
                lavadora = lavadoraSeleccionada == 1 ? lavadora1 : lavadoraSeleccionada == 2 ? lavadora2 : lavadora3;
            }

            switch (opcion) {
                case 1:
                    System.out.println(lavadora.abrirPuerta());
                    break;
                case 2:
                    System.out.println(lavadora.cerrarPuerta());
                    break;
                case 3:
                    System.out.print("Tipo de prenda: ");
                    String tipo = scanner.next();
                    System.out.print("Color de la prenda: ");
                    String color = scanner.next();
                    System.out.print("Peso de la prenda: ");
                    int peso = scanner.nextInt();
                    System.out.print("Nivel de suciedad (Baja/Media/Alta): ");
                    String suciedad = scanner.next();

                    Prenda prenda = new Prenda(tipo, color, peso, suciedad);
                    System.out.println(lavadora.introducirPrenda(prenda));
                    break;
                case 4:
                    System.out.print("Cantidad de detergente: ");
                    int cantidad = scanner.nextInt();
                    System.out.println(lavadora.añadirDetergente(cantidad));
                    break;
                case 5:
                    System.out.println(lavadora.iniciarLavado());
                    break;
                case 6:
                    System.out.println(lavadora.retirarRopa());
                    break;
                case 7:
                    System.out.println(lavadora.apagar());
                    break;
                case 8:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}