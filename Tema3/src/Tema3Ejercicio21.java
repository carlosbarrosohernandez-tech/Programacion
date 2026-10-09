/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
import java.util.InputMismatchException;
public class Tema3Ejercicio21 {

    public static void main(String[] args) {
        int num1, num2, resultado; //defino variables
        Scanner entrada = new Scanner (System.in);
        //hago el try que depende de si introduces bien el numero o lo divides entre 0 se calcula o hace el catch
        try {
            System.out.println("Introduce el primer numero: ");
            num1 = entrada.nextInt();
            System.out.println("Introduce el segundo numero: ");
            num2 = entrada.nextInt();
            resultado = num1/num2;
            System.out.println("La divison entre esos numeros es: " + (resultado));
        } catch (InputMismatchException e) {
            System.out.println("Tienes que introducir un numero...");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

}
