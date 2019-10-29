import java.util.Locale;
import java.util.Scanner;

public class CodificadorCesar {
    private int desplazamiento;

    public CodificadorCesar(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public int getDesplazamiento() { return this.desplazamiento; }

    public void setDesplazamiento(int desplazamiento) { this.desplazamiento = desplazamiento; }

    public String codificar(String mensaje) {
        String mensajeCodificado = "";
        for(int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if(c != ' ')
                c += this.desplazamiento;
            mensajeCodificado += c;
        }
        return mensajeCodificado;
    }
}
