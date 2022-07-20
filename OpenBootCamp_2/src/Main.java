public class Main {
    public static void main(String[] args) {
        /**
         * Crear un bucle que permite concatenar textos y imprima el resultado final por consola.
         * concatenar nombres
         * los textos pueden venir de un array string
         * String[] nombres = { "", "", "", "" };
         */
        // Variable que contendrá la frase
        String a = "";
        // Lista de tipo String con palabras
        String[] nombres = { "Hola", "Open", "Boot", "Camp" };
        // Loop forEach para sacar las palabras
        for (String nombre: nombres) {
            // Se declara la variable a y le agregamos las palabras
            a = a +" "+ nombre;

        }
        // MoWstramos variable..
        System.out.println( a  );

    }
}