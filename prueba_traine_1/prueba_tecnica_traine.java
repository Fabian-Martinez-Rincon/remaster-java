
import java.util.Scanner;

public class prueba_tecnica_traine {

    public static void main(String[] args) {
        System.out.println("Hola, bienvenido a la prueba técnica para Traine.");
        char[][] asientos = new char[10][10];
        iniciarAsientos(asientos);
        cargarAsientos(asientos);
        System.out.println("Gracias por utilizar el sistema de gestión de asientos.");
        mostrarAsientos(asientos);
    }

    public static void cargarAsientos(char[][] asientos) {
        int fila, columna;
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese Fila (0-9):");
            fila = scanner.nextInt();
            System.out.println("Ingrese Columna (0-9):");
            columna = scanner.nextInt();
            if (fila < 0 || fila > 9 || columna < 0 || columna > 9) {
                System.out.println("Fila o columna inválida. Intente de nuevo.");
                continue;
            }
            if (asientos[fila][columna] == 'L') {
                asientos[fila][columna] = 'O';
                System.out.println("Asiento en fila " + fila + " y columna " + columna + " ocupado.");
            } else {
                System.out.println("El asiento en fila " + fila + " y columna " + columna + " ya está ocupado.");
                System.out.println("Elija otro asciento:");
            }
            mostrarAsientos(asientos);
            System.out.println("¿Desea continuar? (s/n):");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

    }

    public static void iniciarAsientos(char[][] asientos) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                asientos[i][j] = 'L';
            }
        }
    }

    public static void mostrarAsientos(char[][] asientos) {
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String RED = "\u001B[31m";
        final String CYAN = "\u001B[36m";
        int filas = asientos.length;
        int cols = (filas > 0) ? asientos[0].length : 0;

        System.out.println(CYAN + "Estado de los asientos:" + RESET);
        System.out.println("Leyenda: " + GREEN + "L" + RESET + " = libre, " + RED + "O" + RESET + " = ocupado");
        // Cabecera de columnas
        System.out.print("    ");
        for (int j = 0; j < cols; j++) {
            System.out.printf(" %2d ", j);
        }
        System.out.println();
        // Separador
        System.out.print("   ");
        for (int j = 0; j < cols; j++) {
            System.out.print("----");
        }
        System.out.println();

        // Filas con colores
        for (int i = 0; i < filas; i++) {
            System.out.printf("%2d |", i);
            for (int j = 0; j < cols; j++) {
                char c = asientos[i][j];
                String color = (c == 'L' || c == 'l') ? GREEN : RED;
                String display = String.valueOf(Character.toUpperCase(c));
                System.out.print(" " + color + display + RESET + " |");
            }
            System.out.println();
        }
    }

}
