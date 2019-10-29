import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> frase_cifrado = new ArrayList<Character>();
        String frase_descifrado;

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

        //Combina 2 codificadores
        String criptograma = codificador.codificar(mensaje);
        frase_cifrado = Codificacion.Cifrado(criptograma);
        frase_descifrado = Codificacion.Descifrado(frase_cifrado);


        System.out.println("Mensaje codificado:\n" + frase_descifrado);
        System.out.println("");
        String mensajeDecodificado = codificador.decodificar(frase_descifrado);
        System.out.println("Mensaje decodificado:\n" + mensajeDecodificado);
        System.out.print("*****************************");
    }
}
