/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int importe = teclado.nextInt();
        int original = importe; // Guardamos el total inicial

        // Dividimos y nos quedamos con el resto para seguir descomponiendo
        int b50 = importe / 50;
        importe %= 50;
        int b20 = importe / 20;
        importe %= 20;
        int b10 = importe / 10;
        importe %= 10;
        int b5 = importe / 5;
        importe %= 5;
        int m2 = importe / 2;
        int m1 = importe % 2;

        // Solo mostramos los tipos de los que haya al menos uno
        System.out.println(original + " Euros se descomponen en:");

        if (b50 > 0) {
            System.out.println("Billetes de 50: " + b50);
        }
        if (b20 > 0) {
            System.out.println("Billetes de 20: " + b20);
        }
        if (b10 > 0) {
            System.out.println("Billetes de 10: " + b10);
        }
        if (b5 > 0) {
            System.out.println("Billetes de 5: " + b5);
        }
        if (m2 > 0) {
            System.out.println("Monedas de 2 euros: " + m2);
        }
        if (m1 > 0) {
            System.out.println("Monedas de 1 euro: " + m1);
        }

    }
}
