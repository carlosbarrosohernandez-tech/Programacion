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

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, primera, segunda, tercera, cuarta;

        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        numero = entrada.nextInt();

        primera = numero / 1000; //dividir entre 1000 da la primera cifra
        segunda = (numero / 100) % 10; //quitar 2 cifras y quedarse con la ultima
        tercera = (numero / 10) % 10; //quitar 1 cifra y quedarse con la ultima
        cuarta = numero % 10; //el resto entre 10 es la ultima cifra

        System.out.println("La primera cifra es: " + primera);
        System.out.println("La segunda cifra es: " + segunda);
        System.out.println("La tercera cifra es: " + tercera);
        System.out.println("La cuarta cifra es: " + cuarta);
    }
}
