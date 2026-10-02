/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, n4;
        int aux; // Variable auxiliar para intercambiar valores

        System.out.print("Por favor, introduzca el primer numero: ");
        n1 = teclado.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");
        n2 = teclado.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        n3 = teclado.nextInt();
        System.out.print("Por ultimo, introduzca un cuarto numero: ");
        n4 = teclado.nextInt();

        // Hacemos el rollo entero para calcular el orden
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if (n3 > n4) {
            aux = n3;
            n3 = n4;
            n4 = aux;
        }

        // 2ª pasada: el segundo mayor acaba en n3
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        // 3ª pasada: se ordenan n1 y n2
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        System.out.println("El orden de los numeros introducidos es el "
                + n1 + " - " + n2 + " - " + n3 + " - " + n4);

    }
}