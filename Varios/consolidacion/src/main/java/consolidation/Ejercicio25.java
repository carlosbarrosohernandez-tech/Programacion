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

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double num1, num2, num3, suma, producto;

        System.out.print("Por favor, introduzca el primer número: ");
        num1 = entrada.nextDouble();
        System.out.print("Por favor, introduzca el segundo número: ");
        num2 = entrada.nextDouble();
        System.out.print("Por favor, introduzca el tercer número: ");
        num3 = entrada.nextDouble();

        suma = num1 + num2 + num3; //sumar los 3 numeros
        producto = num1 * num2 * num3; //multiplicar los 3 numeros

        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
    }
}
