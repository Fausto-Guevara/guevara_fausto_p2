/*
 * @author Guevara Thomas Fausto Yahel
 * @version 2.0
 * @date 19-Marzo-2024 
 */
 public class Problema02 {
    public static void main(String[] pps) {
        // Cadena original del oso en ASCII con bufanda
        String oso = "\n\n" +
            " .-\"\"-.          ( )-\"```\"-( )          .-\"\"-.\n" +
            "/ O O  \\          /         \\          /  O O \\\n" +
            "|O .-.  \\        /   0 _ 0   \\        /  .-. O|\n" +
            "\\ (   )  '.    _|     (_)     |     .'  (   ) /\n" +
            " '.`-'     '-./ |             |`\\.-'     '-'.\\'\n" +
            "   \\         |  \\   \\     /   /  |         /\n" +
            "    \\        \\   '.  '._.'  .'   /        /\n" +
            "     \\        '.   `'-----'`   .'        /\n" +
            "      \\   .'    '-._        .-'\\   '.   /\n" +
            "       |/`          `'''''')    )    `\\|\n" +
            "        /                  (    (      ,\\\n" +
            "       ;                    \\    '-..-'/ ;\n" +
            "       |                     '.       /  |\n" +
            "       |                       `'---'`   |\n" +
            "       ;                                 ;\n" +
            "        \\                               /\n" +
            "         `.                           .'\n" +
            "           '-._                   _.-'\n" +
            "            __/`\"  '  - - -  ' \"`` \\__\n" +
            "          /`            /^\\           `\\\n" +
            "          \\(          .'   '.         )/\n" +
            "           '.(__(__.-'       '.__)__).'";

        // Mostrar el oso original con bufanda
        System.out.println("Oso con Bufanda:");
        System.out.println(oso);

        // Crear un nuevo StringBuilder para modificar la cadena del oso
        StringBuilder osoSinBufanda = new StringBuilder(oso);

        // Definir las modificaciones para eliminar la bufanda
        int[][] modificaciones = {
            // {número de línea, índice de inicio, índice de fin}
            {18, 25, 35}, 
            {16, 26, 50}
        };

        // Mostrar líneas antes de aplicar modificaciones
        String[] lines = osoSinBufanda.toString().split("\n");
        System.out.println("\nLíneas antes de modificaciones:");
        for (int i = 0; i < lines.length; i++) {
            System.out.printf("%2d: %s\n", (i + 1), lines[i]);
        }

        // Aplicar las modificaciones
        for (int[] mod : modificaciones) {
            int linea = mod[0];
            int inicio = mod[1];
            int fin = mod[2];
            if (linea > 0 && linea <= lines.length) {
                String line = lines[linea - 1];
                if (inicio >= 0 && fin < line.length() && inicio <= fin) {
                    String modifiedLine = line.substring(0, inicio) + " ".repeat(fin - inicio + 1) + line.substring(fin + 1);
                    lines[linea - 1] = modifiedLine;
                }
            }
        }
        
        // Mostrar líneas después de aplicar modificaciones
        System.out.println("\nLíneas después de modificaciones:");
        for (int i = 0; i < lines.length; i++) {
            System.out.printf("%2d: %s\n", (i + 1), lines[i]);
        }

        osoSinBufanda = new StringBuilder(String.join("\n", lines));

        // Mostrar el oso sin bufanda
        System.out.println("Oso sin Bufanda:");
        System.out.println(osoSinBufanda.toString());
    }
}
