/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio15 {
        public static void main(String[] args) {
            //declaracion de variables
            int numero;
            int resultado;
            int i;
            //Le pedimos al usuario el numero
            Scanner teclado = new Scanner (System.in);
            
            System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
            numero = teclado.nextInt();
            
            //con un bucle sacamos la tabla de multiplicar del numero que pone el usuario
            for (i=0; i<=10; i++) {
                resultado = numero * i;
                System.out.println(numero + "*" + i + "=" + resultado);
            }
        }    
    
}
