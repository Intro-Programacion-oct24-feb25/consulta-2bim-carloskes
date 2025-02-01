/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author carlo
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 5;
        System.out.println("El factorial de " + num + " es: " + resultado(num));
    }
     public static int resultado(int n) {
        if (n == 0) {
            return 1;
        }
        return n * resultado(n - 1); //5*(5-1)= 24
    }
    
}
