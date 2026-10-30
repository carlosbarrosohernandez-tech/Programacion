/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio13;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio13 {

    public static int pedirNum() {
        //Pedimos el numero
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero y imprimire todos los existentes entre el 1 y tu numero");
        numero = entrada.nextInt();
        return numero;
    }

    public static boolean comprobarNum(int numero) {
        //Si es mayor q uno entonces devuelve true y si no false
        if (numero > 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarRes(boolean correcto, int numero) {
        //En caso de que sea true pues sacamos todos los numeros
        if (correcto) {
            for (int num1 = 1; num1 <= numero; num1++) {
                System.out.println(num1);
            }
        } 
    }

    public static void main(String[] args) {
        int numero;
        boolean correcto;
        //bulce para que saque lo de mostrarRes siempre y cuando sea correcto (osea true)
        do {
            numero = pedirNum();
            correcto = comprobarNum(numero);
            if (!correcto) {
                System.out.println("Error: tienes que introducir un numero mayor que 1");
            }
        } while (!correcto);
        
        mostrarRes(correcto, numero);
    }

}

/*
    public static void main(String[] args) {
        int num1, num2; //defino variales

        Scanner entrada = new Scanner(System.in);
// hago un do while para que se ejecute hasta que lo haga bien y luego el for para imprimir los numeros
        do {
            System.out.println("Introduce un numero mayor que 1: ");
            num2 = entrada.nextInt();
            if (num2 <= 1) {
                System.out.println("Error: tienes que introducir un numero mayor que 1");
            }
        } while (num2 <= 1);

        for (num1 = 1; num1 <= num2; num1++) {
            System.out.println(num1);
        }
    }
}






 */
