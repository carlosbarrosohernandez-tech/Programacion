
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio4 {
                public static void main(String[] args) {
                Scanner numeros = new Scanner (System.in);
                int num1, num2, num3; //Hacemos las variables
                //Pedimos los numeros
                System.out.println("Por favor, introduzca el primer numero: ");
                num1 = numeros.nextInt();
                
                System.out.println("Ahora, introduzca un segundo numero: ");
                num2 = numeros.nextInt();
                
                System.out.println("Por ultimo, introduzca un tercer numero: ");
                num3 = numeros.nextInt();
                // Calculamos cual es el menor de todos
                if (num1 < num2 && num1 < num3) {
                    System.out.println("El numero menor de los introducidos es el: " + num1);
                    
                }
                else if (num2 < num1 && num2 < num3) {
                    System.out.println("El numero menor de los introducidos es el: " + num2);
                }
                
                else {
                    System.out.println("El numero menor de los introducido es el: " + num3);
                }
            }
    
}
