
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Administrador
 */

public class Demo {
    static int valor = 100;
    public static void main(String[] args) {
        int nuevoValor;
        System.out.println(valor);
        nuevoValor= llenar(valor);
        System.out.println(valor);
        
    }
    public static int llenar(int n){
        n=n+1;
        System.out.println(nuevoValor);
        return n;
    }
}
