/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        
        System.out.println("Porf favor, introduzca un numero: ");
        numero = teclado.nextInt();
        
        if (numero > 0) {
            System.out.println("El numero introduzido es positivo");
        }
        else if (numero < 0) {
            System.out.println("El numero introduzido es negativo");
        }
        else {
            System.out.println("El numero es neutro");
        }
        
        
        
    }
}
