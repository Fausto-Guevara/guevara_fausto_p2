/*
 * @author Guevara Thomas Fausto Yahel
 * @version 2.0
 * @date 19-Marzo-2024 
 */


 public class Problema01 {
    public static void main(String[] pps) {
        String camello;
        camello =
            "               Camello\n" +
            "                     .--.      .'  `.\n" +
            "                   .' . :\\    /   :  L\n" +
            "                   F     :\\  /   . : |        .-._\n" +
            "                  /     :  \\/        J      .' ___\\\n" +
            "                 J     :   /      : : L    /--'   ``.\n" +
            "                 F      : J           |  .<'.o.  `-'>\n" +
            "                /        J             L \\_>.   .--w)\n" +
            "               J        /              \\_/|   . `-__|\n" +
            "               F                        / `    -' /|)\n" +
            "              |   :                    J   '        |\n" +
            "             .'   ':                   |    .    :  \\\n" +
            "            /                          J      :     |L\n" +
            "           F                              |     \\   ||\n" +
            "          F .                             |   :      |\n" +
            "         F  |                             ; .   :  : F\n" +
            "        /   |                                     : J\n" +
            "       J    J             )                ;        F\n" +
            "       |     L           /      .:'                J\n" +
            "      'F:     L        ./       :: :       .       F\n" +
            "      `F:     .\\    `:.J         :::.             J\n" +
            "      J       ::\\    `:|        |::::\\            |\n" +
            "      J        |:`.    J        :`:::\\            F\n" +
            "       L   :':/ \\ `-`.  \\       : `:::|        .-'\n" +
            "       |     /   L    >--\\         :::|`.    .-'\n" +
            "       J    J    |    |   L     .  :::: :`, /\n" +
            "        L   F    J    )   |        >::   : /\n" +
            "        |  J      L   F   \\     .-.:'   . /\n" +
            "        ): |     J   /     `-   | |   .--'\n" +
            "        /  |     |: J        L  J J   )\n" +
            "        L  |     |: |        L   F|   /\n" +
            "        \\: J     \\:  L       \\  /  L |\n" +
            "         L |      \\  |        F|   | )\n" +
            "         J F       \\ J       J |   |J\n" +
            "          L|        \\ \\      | |   | L\n" +
            "          J L        \\ \\     F \\   F |\n" +
            "           L\\         \\ \\   J   | J   L\n" +
            "          /__\\_________)_`._)_  |_/   \\_____\n" +
            "                              \"\"   `\"\"\"";

        // Llamar a la función para insertar la cola
        String camelloConCola = insertarCola(camello);

        // Imprimir el resultado
        System.out.println("Camello original:");
        System.out.println(camello);
        System.out.println("Camello con cola:");
        System.out.println(camelloConCola);
    }

    // Función para insertar la cola en la representación de camello
    public static String insertarCola(String camello) {
        String cola =
            "                    \\  |  |\n" +
            "                     \\ | /\n" +
            "                      \\|/\n" +
            "                       |\n" +
            "                      /|\\\n" +
            "                     / | \\\n" +
            "                    /  |  \\ \n";

        // Separamos el camello en líneas
        String[] lineas = camello.split("\n");

        // Insertamos la cola después de la segunda 'F'
        StringBuilder camelloConCola = new StringBuilder();
        int contadorF = 0;
        for (int i = 0; i < lineas.length; i++) {
            camelloConCola.append(lineas[i]).append("\n");
            if (lineas[i].contains("F")) {
                contadorF++;
                if (contadorF == 2) {
                    camelloConCola.append(cola);
                }
            }
        }
        return camelloConCola.toString();
    }
}
