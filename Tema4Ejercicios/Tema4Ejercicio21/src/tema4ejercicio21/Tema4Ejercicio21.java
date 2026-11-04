/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio21;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio21 {

    public static int PedirNum1() {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num = entrada.nextInt();
        return num;
    }

    public static int PedirNum2(int num1) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el segundo numero: ");
        num = entrada.nextInt();

        while (num <= num1) {
            System.out.println("Error. El numero debe ser mayor que " + num1 + ". Introduce otro: ");
            num = entrada.nextInt();
        }
        return num;
    }

    public static void MostrarResultado(int num1, int num2) {
        int sumaPares = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
    }

    public static void main(String[] args) {
        int n1 = PedirNum1();
        int n2 = PedirNum2(n1);
        MostrarResultado(n1, n2);
    }
}
