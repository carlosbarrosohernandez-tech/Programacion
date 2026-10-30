/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio11;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio11 {

    public static double pedirNumero() {
        double numero;
        Scanner teclado = new Scanner(System.in);
        do {
            //pedimos el numero
            System.out.println("Introduce un numero positivo:");
            numero = teclado.nextDouble();

            //hacemos la raiz si el numero es positivo
            if (numero < 0) {
                System.out.println("El número introducido no es válido, introduce otro.");
            }
        } while (numero < 0);
        return numero;
    }

    public static double calcularRaiz(double numero) {
        double raiz;
        raiz = Math.sqrt(numero);
        return raiz;
    }

    public static void mostrarNumero(double numero, double raiz) {
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }

    public static void main(String[] args) {
        double numero, raiz;
        numero = pedirNumero();
        raiz = calcularRaiz(numero);
        mostrarNumero(numero, raiz);

    }
}
