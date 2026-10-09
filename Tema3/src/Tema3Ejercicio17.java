/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio17 {

    public static void main(String[] args) {
        double numero, raiz; //variables
        Scanner teclado = new Scanner(System.in);

        do {
            //pedimos el numero
            System.out.println("Introduce un número positivo:");
            numero = teclado.nextDouble();
            
            //hacemos la raiz si el numero es positivo
            if (numero <= 0) {
                System.out.println("El número introducido no es válido, introduce otro.");
            } else {
                raiz = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
            }
            //funciona mientras que el numero introducido sea positivo
        } while (numero <= 0);

    }
}
