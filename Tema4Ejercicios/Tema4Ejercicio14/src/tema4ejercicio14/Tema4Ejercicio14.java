/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio14;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio14 {

    public static int pedirNum() {
        //Pedimos numero
        int numero;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        return numero;
    }

    public static boolean comprobarMay(int numero) {
        //si es igual o menor a 0 false y si no true
        if (numero <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void mostrarRes(int numero) {
        //Esto es para sacar ya el resultado osea los multiplos y el numero ttoal de numeros
        int total=0;
            System.out.println("Los multiplos de 3 entre 1 y " + numero + " son:");
            for (int num1 = 1; num1 <= numero; num1++) {
                if (num1 % 3 == 0) {
                    total++;
                    System.out.println(num1);
                }
                System.out.println("El numero total de numeros mostrados es: " + total);

            }
        
    }

    public static void main(String[] args) {
        int numero;
        boolean correcto;
        //bucle para sacar el resultado o error si el return de antes era false
        do {
            numero = pedirNum();
            correcto = comprobarMay(numero);
            if (!correcto) {
                System.out.println("Error: tienes que introducir un numero mayor que 0");
            }
        } while (!correcto);
        
        mostrarRes(numero);

    }

}

/*

    public static void main(String[] args) {
        int num1, num2, total=0; //declaro variables
        Scanner entrada = new Scanner(System.in);
//hago un do while que te obliga a meter si o si un numero mayor q 0
        do {
            System.out.println("Introduce un numero mayor que 0: ");
            num2 = entrada.nextInt();
            if (num2 <= 0) {
                System.out.println("Error: tienes que introducir un numero mayor que 0");
            }
        } while (num2 <= 0);
        //si el numero es mayor que cero el for calcula la suma y luego lo saco con print
        System.out.println("Los multiplos de 3 entre 1 y " + num2 + " son:");

        for (num1 = 1; num1 <= num2; num1++) {
            if (num1 % 3 == 0) {
                total++;
                System.out.println(num1);
            }

        }
        System.out.println("El numero total de numeros mostrados es: " + total);

    }
}

 */
