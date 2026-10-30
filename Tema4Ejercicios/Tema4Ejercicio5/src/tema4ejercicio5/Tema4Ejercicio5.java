/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio5;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio5 {

    public static void main(String[] args) {
        //Declaramos variables
        int num;
        Scanner entrada = new Scanner (System.in);
        //Pedimos el numero
        System.out.println("Introduce el numero: ");
        num = entrada.nextInt();
        //LLamamos al metodo
        comparar.Mayor_Menor(num);
                
    }
}
