/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio25 {

    public static void main(String[] args) {
        int num1, num2 = 139, suma=0; //declaro variables
        //el for recorre del 17 hasta el 139 y el if hace que si es par se va guardando en suma y sumando to el rato
        for (num1 = 17; num1 <= num2; num1++) {
            if (num1 % 2 == 0) {
                suma = suma + num1;
            } 
        }
        System.out.println("La suma total de los numeros primos es: " + suma);

    }

}
