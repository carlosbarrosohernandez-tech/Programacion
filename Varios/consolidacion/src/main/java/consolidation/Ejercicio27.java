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

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado, cubo;

        System.out.print("Por favor, introduzca un número: ");
        numero = entrada.nextInt();

        cuadrado = numero * numero; //numero por si mismo 2 veces
        cubo = numero * numero * numero; //numero por si mismo 3 veces

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
}
