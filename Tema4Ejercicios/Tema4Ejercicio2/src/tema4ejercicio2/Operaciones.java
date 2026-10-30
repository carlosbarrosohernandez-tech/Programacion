/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio2;

/**
 * Clase con los metodos del Ejercicio 2 del Tema 4.
 * Esta en el mismo paquete que el main (metodoej2), por eso no hace falta import.
 *
 * @author carlo
 */
public class Operaciones {

    /**
     * Multiplica dos numeros y muestra la operacion y el resultado.
     *
     * @param num1 primer numero
     * @param num2 segundo numero
     */
    public static void multiplicar(int num1, int num2) {
        //Multiplicamos num1 y num2
        int r = num1 * num2;
        //Mostramos la operacion realizada y el resultado
        System.out.println("La operacion que se realizo es producto: " + num1 + " x " + num2 + " = " + r);
    }

    /**
     * Suma dos numeros y muestra la operacion y el resultado.
     *
     * @param num1 primer numero
     * @param num2 segundo numero
     */
    public static void sumar(int num1, int num2) {
        //Sumamos num1 y num2
        int r = num1 + num2;
        //Mostramos la operacion realizada y el resultado
        System.out.println("La operacion que se realizo es suma: " + num1 + " + " + num2 + " = " + r);
    }

}
