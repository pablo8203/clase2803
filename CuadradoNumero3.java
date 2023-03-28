package com.pjs.app;

import java.util.InputMismatchException;// VAMOS A IMPORTAR EL PAQUETE QUE CONTIENE 
import java.util.Scanner;				//

public class CuadradoNumero3 {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean continua;
        do {
            try {
                continua = false;
                System.out.print("Ingrese un valor entero:");
                num = teclado.nextInt();
                int cuadrado = num * num;
                System.out.print("El cuadrado de " + num + " es " + cuadrado);
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entero.");
                teclado.next(); // devuelve el siguiente elemento en una iteracion.
                continua = true;
            }
        } while (continua); // La estructura repetitiva do-while es aquella en que el 
        					//cuerpo del bucle se repite mientras que se cumple una 
        					//determinada condición.CUANDO LA CONDICION SEA TRUE, SE CUMPLE Y SALE
    }
}