import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {

    // Constructor que permite la lectura desde el teclado
    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }

    // Constructor que permite la lectura desde un objeto Reader
    public LecturaNumeros(Reader r) {
        super(r);
    }

    // Método que devuelve un int leído desde la entrada estándar
    public int readInt() throws IOException {
        return Integer.parseInt(this.readLine());
    }

    // Método que muestra un mensaje antes de leer un int desde la entrada estándar
    public int readInt(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readInt();
    }

    // Método que devuelve un Integer leído desde la entrada estándar
    public Integer readInteger() throws IOException {
        return Integer.valueOf(this.readLine());
    }

    // Método que devuelve un double leído desde la entrada estándar
    public double readDouble() throws IOException {
        return Double.parseDouble(this.readLine());
    }

    // Método que muestra un mensaje antes de leer un double desde la entrada estándar
    public double readDouble(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readDouble();
    }
}
