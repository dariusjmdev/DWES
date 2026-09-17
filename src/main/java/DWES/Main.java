package DWES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese una descripción de la incidencia: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el nombre de la aula: ");
        String aula = scanner.nextLine();
        System.out.print("Ingrese el nombre del profesor: ");
        String profesor = scanner.nextLine();
        System.out.print("Ingrese el número de equipos afectados: ");
        int numEquipos = Integer.parseInt(scanner.nextLine());

        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Aula: " + aula);
        System.out.println("Profesor: " + profesor);
        System.out.println("Equipos afectados: " + numEquipos);
    }
}