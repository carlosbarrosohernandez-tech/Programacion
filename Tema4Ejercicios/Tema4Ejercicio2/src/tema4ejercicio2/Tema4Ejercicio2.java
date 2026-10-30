/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio2;

import java.util.Scanner;

/**
 * Ejercicio 2 del Tema 4: pide dos numeros en el main y, si el primero es
 * mayor que 10, los multiplica; si no, los suma. Los metodos estan en la
 * clase Operaciones, dentro del mismo paquete (metodoej2).
 *
 * @author carlo
 */
public class Tema4Ejercicio2 {

    public static void main(String[] args) {
        //Declaramos las variables
        int num1, num2;
        //Pedimos los numeros
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        //Si el primer numero es mayor que 10 multiplicamos, si no sumamos
        if (num1 > 10) {
            Operaciones.multiplicar(num1, num2);
        } else {
            Operaciones.sumar(num1, num2);
        }
    }

}
