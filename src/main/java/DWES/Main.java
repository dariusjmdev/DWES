package DWES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del técnico: ");
        String nombreTecnico = sc.nextLine();

        System.out.print("Introduce el número de incidencias abiertas: ");
        int numIncidencias = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Introduce el número de incidencias en proceso: ");
        int numIncidenciasProceso = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Introduce el número de incidencias cerradas: ");
        int numIncidenciasCerradas = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Introduce el número de minutos dedicados por incidencia: ");
        int minutosPorIncidencia = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Nombre del técnico: " + nombreTecnico);

        int totalIncidencias = calcularTotalIncidencias(numIncidencias, numIncidenciasProceso, numIncidenciasCerradas);
        System.out.println("El total de incidencias es: " + totalIncidencias);

        int incidenciasPendientes = calcularIncidenciasPendientes(numIncidencias, numIncidenciasProceso);
        System.out.println("El total de incidencias pendientes es: " + incidenciasPendientes);

        double porcentajeCerradas = calcularPOrcentajeIncidenciasCerradas(numIncidenciasCerradas, totalIncidencias);
        System.out.println("El porcentaje de incidencias cerradas es: " + porcentajeCerradas + "%");

        double tiempoTotalDedicado = calcularTiempoTotalDedicado(incidenciasPendientes, minutosPorIncidencia);
        System.out.println("El tiempo total dedicado a incidencias pendientes es: " + tiempoTotalDedicado + " horas");
    }
    public static int calcularTotalIncidencias(int numIncidencias, int numIncidenciasProceso, int numIncidenciasCerradas) {
        return numIncidencias + numIncidenciasProceso + numIncidenciasCerradas;
    }
    public static int calcularIncidenciasPendientes(int numIncidencias, int numIncidenciasProceso) {
        return numIncidencias + numIncidenciasProceso;
    }
    public static double calcularPOrcentajeIncidenciasCerradas(int numIncidenciasCerradas, int totalIncidencias) {
        if (totalIncidencias == 0) {
            return 0.0; // Evitar división por cero
        }
        return (double) numIncidenciasCerradas / totalIncidencias * 100.0;
    }
    public static double calcularTiempoTotalDedicado(int incidenciasPendientes, int minutosPorIncidencia) {
        return (double) (incidenciasPendientes * minutosPorIncidencia) / 60.0; // Convertir a horas
    }
}