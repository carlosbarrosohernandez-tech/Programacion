/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import metodoej2.Mult;
import metodoej2.Sum;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio2Tema4 {

    public static void main(String[] args) {
        //Declaramos las variables
        int num1, num2;
        //Pedimos los numeros
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        //Llamamos a los metodos para que hagan los calculos
        if (num1 > 10) {
            Mult.multiplicar(num1, num2);
        } else {
            Sum.sumar(num1, num2);
        }
        
                
    }

}
