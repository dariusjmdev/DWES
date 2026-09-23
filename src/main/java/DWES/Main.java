package DWES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarmenu();
    }
    public static void mostrarmenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Registrar incidencia");
            System.out.println("2. Consultar incidencias");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Información del programa");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el titulo de la incidencia: ");
                    String titulo = sc.nextLine();
                    System.out.print("Introduce el aula de la incidencia:");
                    String aula = sc.nextLine();
                    System.out.print("Introduce el número de equipos afectados: ");
                    int numEquipos = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer de entrada
                    System.out.println("Incidencia registrada: " + titulo + ", Aula: " + aula + ", Número de equipos afectados: " + numEquipos);
                    break;
                case 2:
                    System.out.println("Modulo de consulta en desarrollo...");
                    break;
                case 3:
                    System.out.println("Introduce el número de incidencias abiertas: ");
                    int incidenciasAbiertas = sc.nextInt();
                    System.out.println("Introduce el número de incidencias cerradas: ");
                    int incidenciasCerradas = sc.nextInt();
                    System.out.println("Estadísticas: Total de Incidencias : " + incidenciasAbiertas + " + " + incidenciasCerradas + " = " + (incidenciasAbiertas + incidenciasCerradas));
                    break;
                case 4:
                    System.out.println("Información del programa HelpDesk: Versión 0.1. Curso: 2026-2027");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }while (opcion != 0);
    }


}