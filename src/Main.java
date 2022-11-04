public class Main {
    public static void main(String[] args) {

        String[] texto = new String[]{"Pedro", "Ramón", "Juan"};

        System.out.println("Este es el contenido del array: ->");

        //el bucle for recorre todo el array

        for(int i = 0; i < texto.length; i++) {
            System.out.print(texto[i] + ", " );
        }
        System.out.println(" <- aqui termina el bucle for ");

    }
}