/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Demo2 {

    public static void main(String[] args) {

        ingresarCadena();


    }

    public static void ingresarCadena() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cadena");
        String cadena = leer.nextLine();
        int cuadrado;
        if (cadena.length() > 10) {
            cuadrado = (int) Math.pow(cadena.length(), 2);
            System.out.println("El cuadrado de la longitud de la cadena es: " + cuadrado);
        } else {
            if (cadena.length() < 10) {
                cuadrado = (int) Math.pow(cadena.length(), 3);
                System.out.println("El cubo de la longitud de la cadena es: " + cuadrado);
            } else {
            }
        }

    }
}
