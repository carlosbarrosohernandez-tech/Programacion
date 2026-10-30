/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio15;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio15 {

    //metodo para pedir un numero al usuario
    public static int pedirNumero(String mensaje) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        numero = entrada.nextInt();
        return numero;
    }

    //metodo que muestra el menu y devuelve la opcion que elige el usuario
    public static int mostrarMenu() {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige que quieres hacer:");
        System.out.println("1. Sumar los numeros");
        System.out.println("2. Restar los numeros");
        System.out.println("3. Multiplicar los numeros");
        System.out.println("4. Dividir los numeros");
        System.out.println("5. Salir del programa");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static void sumar(int num1, int num2) {
        int resultado;
        resultado = num1 + num2;
        System.out.println("La suma de tus numeros es: " + resultado);
    }

    public static void restar(int num1, int num2) {
        int resultado;
        resultado = num1 - num2;
        System.out.println("La resta de tus numeros es: " + resultado);
    }

    public static void multiplicar(int num1, int num2) {
        int resultado;
        resultado = num1 * num2;
        System.out.println("La multiplicacion de tus numeros es: " + resultado);
    }

    //en dividir hacemos el catch por si divide entre 0
    public static void dividir(int num1, int num2) {
        int resultado;
        try {
            resultado = num1 / num2;
            System.out.println("La division de tus numeros es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage() + " no se puede dividir entre 0");
        }
    }

    public static void main(String[] args) {
        int num1, num2, opcion; //declaramos variables
        //Pedimos los 2 numeros
        num1 = pedirNumero("Introduce el numero 1: ");
        num2 = pedirNumero("Introduce el numero 2: ");
        //do while con switch, llamando a cada metodo segun la opcion
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1: {
                    sumar(num1, num2);
                    break;
                }
                case 2: {
                    restar(num1, num2);
                    break;
                }
                case 3: {
                    multiplicar(num1, num2);
                    break;
                }
                case 4: {
                    dividir(num1, num2);
                    break;
                }
                case 5: {
                    System.out.println("Has finalizado el programa...");
                    break;
                }
                //si mete un numero que no debe da error
                default: {
                    System.out.println("Elige un numero de los que te han indicado...");
                    break;
                }
            }
        } while (opcion != 5);
    }
}