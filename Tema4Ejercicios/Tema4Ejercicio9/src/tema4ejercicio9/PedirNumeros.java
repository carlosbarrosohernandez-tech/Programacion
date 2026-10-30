/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio9;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class PedirNumeros {

    public static int pedirPrimerNumero() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero a comparar");
        numero = entrada.nextInt();
        return numero;

    }

    public static int pedirSegundoNumero() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el segundo numero a comparar");
        numero = entrada.nextInt();
        return numero;

    }

    public static int pedirTercerNumero() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tercer numero a comparar");
        numero = entrada.nextInt();
        return numero;

    }

    public static void comparar(int numero1, int numero2, int numero3) {
        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("El menor de los tres es el: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("El menor de los tres es el: " + numero2);
        } else {
            System.out.println("El menor de los tres es el: " + numero3);
        }
    }

}
