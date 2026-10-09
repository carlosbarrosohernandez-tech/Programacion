/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio2 {
        public static void main(String[] args) {
            Scanner numeros = new Scanner (System.in);
            int num1, num2, multiplicacion, suma;
            
            System.out.println("Por favor, introduzca un numero: ");
            num1 = numeros.nextInt();
            
            System.out.println("Ahora, introduzca un segundo numero: ");
            num2 = numeros.nextInt();
            
            if (num1 > 10) {
                multiplicacion = num1 * num2;
                System.out.println("La operacion que se realizo es MULTIPLICACION y el resultado es: " + multiplicacion);
                
            }
            else {
                suma = num1 + num2;
                System.out.println("La operacion que se realizo es SUMA y el resultado es: " + suma);
            }
                    
        }
    
}
