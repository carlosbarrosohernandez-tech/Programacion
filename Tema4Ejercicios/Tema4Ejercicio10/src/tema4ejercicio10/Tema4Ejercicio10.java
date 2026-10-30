/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio10;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio10 {

    public static int pedirNumero() {
        int numero;

        //Le pedimos al usuario el numero
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
        numero = teclado.nextInt();
        return numero;
    }

    public static void mostrarTabla(int numero) {
        //con un bucle sacamos la tabla de multiplicar del numero que pone el usuario
        int i, resultado;
        for (i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + "*" + i + "=" + resultado);
        }

    }

    public static void main(String[] args) {
        mostrarTabla(pedirNumero());
    }

}
