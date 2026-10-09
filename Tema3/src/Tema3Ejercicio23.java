


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class Tema3Ejercicio23 {

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
