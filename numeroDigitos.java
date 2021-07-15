package Semana6;

/**
 * Nombre del programa: 
 * Descripcion: Hallar el número de dígitos de un número entero positivo.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp4w6 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int numero;
        int digitos=0;

        escribir.println("Digite un numero:");
        numero = Integer.parseInt(leer.readLine());

        for (int count=1; numero>0; count++){
            numero = numero/10;
            digitos = count;
        }

        escribir.println("La cantidad de digitos del numero es de: " +digitos);
    }
}