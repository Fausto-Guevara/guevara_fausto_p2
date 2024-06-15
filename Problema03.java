/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 19-Marzo-2024 
 */

import java.util.Scanner;

public class Problema03 {
    public static void main(String[] args) {
        // Usar try-with-resources para asegurar que el Scanner se cierra automáticamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Ejemplo de fecha
            String fechaEjemplo = "12-02-2024";
            System.out.println("Ejemplo de fecha: " + fechaEjemplo);
            int sumaEjemplo = sumarComponentesFecha(fechaEjemplo);
            System.out.println("La suma de los valores de la fecha " + fechaEjemplo + " es: " + sumaEjemplo);

            // Solicitar al usuario que ingrese una fecha
            System.out.print("\nPor favor, ingrese una fecha en el formato dia-mes-año: ");
            String fechaUsuario = scanner.nextLine();

            // Validar y procesar la fecha ingresada por el usuario
            if (fechaUsuario.matches("\\d{2}-\\d{2}-\\d{4}")) {
                int sumaUsuario = sumarComponentesFecha(fechaUsuario);
                System.out.println("La suma de los valores de la fecha " + fechaUsuario + " es: " + sumaUsuario);
            } else {
                System.out.println("Formato de fecha inválido. Por favor, use el formato dia-mes-año.");
            }
        } // El Scanner se cierra automáticamente aquí
    }

    public static int sumarComponentesFecha(String fecha) {
        // Dividir la fecha en componentes
        String[] componentes = fecha.split("-");
        String diaStr = componentes[0];
        String mesStr = componentes[1];
        String anioStr = componentes[2];

        // Convertir los componentes a enteros
        int dia = Integer.parseInt(diaStr);
        int mes = Integer.parseInt(mesStr);
        int anio = Integer.parseInt(anioStr);

        // Sumar los valores
        return dia + mes + anio;
    }
}
