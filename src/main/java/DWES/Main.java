package DWES;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Buenos Días!!");

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce el número de incidencias abiertas: ");
        int incidencias_abiertas = sc.nextInt();

        if (incidencias_abiertas < 0) {
            System.out.println("El número de incidencias abiertas no puede ser negativo.");
            return;
        }

        System.out.println("Introduce el número de incidencias cerradas: ");
        int incidencias_cerradas = sc.nextInt();
        if (incidencias_cerradas < 0) {
            System.out.println("El número de incidencias cerradas no puede ser negativo.");
            return;
        }
        int incidencias_totales = incidencias_abiertas + incidencias_cerradas;

        resumenDeveloper(nombre);
        avisoIncidencias(incidencias_abiertas, incidencias_cerradas, incidencias_totales);

        sc.close();
    }

    public static void avisoIncidencias(int incidencias_abiertas, int incidencias_cerradas, int incidencias_totales) {
        if (incidencias_abiertas == 0) {
            System.out.println("Todo en orden");
        } else {
            System.out.println("Hay incidencias pendientes!!!!");
        }
        System.out.println("Número de incidencias abiertas: " + incidencias_abiertas);
        System.out.println("Número de incidencias cerradas: " + incidencias_cerradas);
        System.out.println("Número de incidencias totales: " + incidencias_totales);
    }
    public static void resumenDeveloper(String nombre) {
        System.out.println("Técnico " + nombre);
    }
}