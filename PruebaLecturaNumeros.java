package mypackage; // Ajusta esto según el nombre de tu paquete

import java.io.IOException;

public class PruebaLecturaNumeros {
    public static void main(String[] args) {
        LecturaNumeros lector = new LecturaNumeros();
        
        try {
            // Leer dos números enteros usando readInt
            int numero1 = lector.readInt("Introduce el primer número entero: ");
            int numero2 = lector.readInt("Introduce el segundo número entero: ");
            
            // Leer un número entero como Integer usando readInteger
            Integer numero3 = lector.readInteger();
            
            // Leer un número double usando readDouble
            double numero4 = lector.readDouble("Introduce un número double: ");
            
            // Leer un número double sin mensaje
            double numero5 = lector.readDouble();
            
            // Desplegar los números leídos
            System.out.println("Primer número entero: " + numero1);
            System.out.println("Segundo número entero: " + numero2);
            System.out.println("Número Integer: " + numero3);
            System.out.println("Primer número double: " + numero4);
            System.out.println("Segundo número double: " + numero5);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
