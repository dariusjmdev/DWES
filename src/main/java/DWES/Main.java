package DWES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Introduce la descripción del probema: ");
        String descripcion = sc.nextLine();

        System.out.print("Introduce el número de equipos afectados: ");
        int numEquipos = sc.nextInt();

        String prioridad = establecerPrioridad(numEquipos);

        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Número de equipos afectados: " + numEquipos);
        System.out.println("Prioridad: " + prioridad);

    }
    public static String establecerPrioridad(int numEquipos) {
        if (numEquipos < 0) {
            return "Número de equipos no puede ser negativo";
        } else if (numEquipos == 1) {
            return "Baja";
        } else if (2 <= numEquipos && numEquipos <= 5) {
            return "Media";
        } else if (6 <= numEquipos && numEquipos <= 10) {
            return "Alta";
        } else {
            return "Crítica";
        }
    }

}