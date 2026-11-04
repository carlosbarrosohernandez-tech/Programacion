/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio26;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio26 {

    //pedimos el numero al usuario
    public static int PedirNumero() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();
        return numero;
    }

    //miramos si tiene algun divisor a partir del 2, si lo tiene no es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = PedirNumero();

        if (esPrimo(numero)) {
            System.out.println("El " + numero + " es primo");
        } else {
            System.out.println("El " + numero + " no es primo");
        }
    }

}
