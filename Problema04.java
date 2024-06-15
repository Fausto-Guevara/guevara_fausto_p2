/*
 * @author Guevara Thomas Fausto Yahel
 * @version 2.0
 * @date 19-Marzo-2024 
 */

public class Problema04 {
    // Definir los códigos de color ANSI
    public static final String[] COLORS = {
        "\u001B[31m", // Rojo
        "\u001B[32m", // Verde
        "\u001B[33m", // Amarillo
        "\u001B[34m", // Azul
        "\u001B[35m", // Magenta
        "\u001B[36m", // Cian
        "\u001B[37m"  // Blanco
    };
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Definir las líneas del poema
        String[] poema = {
            "Remember, remember, the 5ft of November,",
            "Gunpowder, treason and plot.",
            "I see no reason",
            "Why gunpowder treason",
            "Should ever be forgot",
            "Guy Fawkes, Guy Fawkes, 'twas his intent",
            "To blow up the King and the Parlament"
        };

        // Aplicar las modificaciones a cada línea
        poema[0] = poema[0].toUpperCase();
        poema[2] = poema[2].toString();
        poema[4] = poema[4].toLowerCase();
        poema[6] = alternarPalabras(poema[6]);

        // Imprimir las líneas con los colores
        for (int i = 0; i < poema.length; i++) {
            System.out.println(COLORS[i % COLORS.length] + poema[i] + RESET);
        }
    }

    // Función para alternar cada palabra en una cadena y eliminar espacios
    public static String alternarPalabras(String linea) {
        StringBuilder resultado = new StringBuilder();
        String[] palabras = linea.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (i % 2 == 0) {
                resultado.append(palabras[i].toUpperCase());
            } else {
                resultado.append(palabras[i].toLowerCase());
            }
        }
        return resultado.toString();
    }
}
