

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio22 {

    public static void main(String[] args) {
        int num1, num2, resultado = 0; //defino variables
        Scanner entrada = new Scanner(System.in);
//hago lo mismo q el ejercicio21 pero sumando
        try {
            System.out.println("Introduce el primer numero: ");
            num1 = entrada.nextInt();
            System.out.println("Introduce el segundo numero: ");
            num2 = entrada.nextInt();
            resultado = num1 + num2;
            System.out.println("La suma entre esos numeros es: " + (resultado));
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage()+ ". Tienes que poner un numero");

        }
    }
}
