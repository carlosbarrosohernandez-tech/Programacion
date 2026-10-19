/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoej7;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio7Tema4 {

    public static void main(String[] args) {
        //Declaramos variables
        int num1, num2, num3, num4;
        Scanner entrada = new Scanner(System.in);
        //Pedimos los numeros
        System.out.print("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.print("Por ultimo, introduzca un cuarto numero: ");
        num4 = entrada.nextInt();
        //Llamamos a el metodo
        Ordenar.main(num1, num2, num3, num4);
    }
}
