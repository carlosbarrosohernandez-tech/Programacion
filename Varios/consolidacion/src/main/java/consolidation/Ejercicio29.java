/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolidation;

/**
 *
 * @author carlo
 */

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.print("Por favor, introduzca la longitud del primer cateto: ");
        cateto1 = entrada.nextDouble();
        System.out.print("Por favor, introduzca la longitud del segundo cateto: ");
        cateto2 = entrada.nextDouble();

        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2); //teorema de Pitagoras (raiz cuadrada)

        System.out.println("La hipotenusa del triángulo mide: " + hipotenusa);
    }
}
