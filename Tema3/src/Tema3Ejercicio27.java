
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio27 {

    public static void main(String[] args) {
        int num1, num2, resultado, opcion; //declaramos variables
        Scanner entrada = new Scanner(System.in);
        //Pedmios los 2 numeros
        System.out.println("Introduce el numero 1: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce el numero 2: ");
        num2 = entrada.nextInt();
        //Creamos un do while con switch ya que es un menu y le pedimos al usuario que eliga una opcion
        do {
            System.out.println("Elige que quieres hacer:");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Salir del programa");
            opcion = entrada.nextInt();
            //depende de que eliga se elige un case u otro
            switch (opcion) {
                case 1: {
                    resultado = num1 + num2;
                    System.out.println("La suma de tus numeros es: " + resultado);
                    break;

                }
                case 2: {
                    resultado = num1 - num2;
                    System.out.println("La resta de tus numeros es: " + resultado);
                    break;
                }
                case 3: {
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion de tus numeros es: " + resultado);
                    break;
                }
                //en el case 4 hacemos el catch por si divide entre 0
                case 4: {
                    try {
                        resultado = num1 / num2;
                        System.out.println("La division de tus numeros es: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage() + " no se puede dividir entre 0");
                    }
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
