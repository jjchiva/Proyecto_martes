import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n***** Codificador César *****");
        // Creo objetos Scanner y CodificadorCesar
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el desplazamiento de la codificación\n> ");
        int desplazamiento = tec.nextInt() % 26;
        tec.nextLine();
        CodificadorCesar codificador = new CodificadorCesar(desplazamiento);

        System.out.print("Introduce el mensaje a codificar\n> ");
        String mensaje = tec.nextLine();
        System.out.println("");
        System.out.println("Mensaje codificado:\n" + codificador.codificar(mensaje));
        System.out.print("*****************************");
    }
}
