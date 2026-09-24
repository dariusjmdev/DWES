package DWES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarOpciones();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada


            switch (opcion) {
                case 1->
                    registrarIncidencia();
                case 2->
                    consultarIncidencias();
                case 3 ->
                    mostrarEstadisticas();
                case 4 ->
                    System.out.println("Información del programa HelpDesk: Versión 0.1. Curso: 2026-2027");
                case 0 ->
                    System.out.println("Saliendo del programa...");
                default->
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }while (opcion != 0);
    }

    public static void registrarIncidencia(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el titulo de la incidencia: ");
        String nombreInidencia = sc.nextLine();

        System.out.print("Introduce el aula de la incidencia: ");
        String aula = sc.nextLine();

        int numEquipos = leerNumeroNoNegativo(
                sc,
                "Introduce el número de equipos afectados: "
        );
        System.out.println("Incidencia registrada: " + nombreInidencia + "," +
                " Aula: " + aula + "," +
                " Número de equipos afectados: " + numEquipos);

    }

    public static void consultarIncidencias(){
        System.out.println("Modulo en desarrollo... ");
    }

    public static void mostrarEstadisticas(){
        Scanner sc = new Scanner(System.in);
        int incidenciasAbiertas = leerNumeroNoNegativo(
                sc,
                "Introduce el número de incidencias abiertas: "
        );
        int incidenciasCerradas = leerNumeroNoNegativo(
                sc,
                "Introduce el número de incidencias cerradas: "
        );
        System.out.println("Estadísticas: Total de Incidencias : " + incidenciasAbiertas + " + " + incidenciasCerradas + " = " + (incidenciasAbiertas + incidenciasCerradas));
    }
    public static int leerNumeroNoNegativo(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);

            if (!sc.hasNextInt()) {
                System.out.println("Debes introducir un número entero.");
                sc.nextLine();
                continue;
            }

            int numero = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            if (numero < 0) {
                System.out.println("El número no puede ser negativo.");
                continue;
            }

            return numero;
        }
    }

    public static void mostrarOpciones(){
        System.out.println("1. Registrar incidencia");
        System.out.println("2. Consultar incidencias");
        System.out.println("3. Mostrar estadisticas");
        System.out.println("4. Información del programa");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}