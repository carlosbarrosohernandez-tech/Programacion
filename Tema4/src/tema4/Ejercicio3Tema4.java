/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import metodoej3.Mayor;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio3Tema4 {

    public static void main(String[] args) {
        //Declaracion de variables
        int num1, num2, num3;
        Scanner entrada = new Scanner (System.in);
        // Pedimos los numeros
        System.out.println("Por favor, introduze el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduza el segundo numero: ");
        num2 =entrada.nextInt();
        System.out.println("Por ltimo, introduzca un tercer numero: ");
        num3 = entrada.nextInt();
        //Llamamos a el metodo para comparar los numeros
        Mayor.mayor(num1, num2, num3);
    }

}
