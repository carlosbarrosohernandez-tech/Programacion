/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio5 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
            int num; // Declaramos variable
            // Pedimos el numero
            System.out.println("Introduce un numero y te digo si es par o impar");
            num = teclado.nextInt();
            // calculamos si es par o impar con %
            if (num % 2 == 0) {
                System.out.println("El numero que has introducido es par");
            }
            else {
                System.out.println("El numero que has introducido es impar");
            }
        }
    
}
