/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class Tema2Ejercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int importe = teclado.nextInt();
        int original = importe; // Guardamos el total inicial

        // Dividimos todo y usamos el resto PARA PODER seguir dividiendo mas
        int b50 = importe / 50;
        importe %= 50;
        int b20 = importe / 20;
        importe %= 20;
        int b10 = importe / 10;  //importe %= es para no tener que poner mas texto
        importe %= 10;
        int b5  = importe / 5;
        importe %= 5;
        int m2  = importe / 2;
        int m1 = importe % 2;
      
        // Imprimimos el resultado
        System.out.println(original + " Euros se descomponen en " + b50 + " billetes de 50, " 
            + b20 + " billetes de 20, " + b10 + " billetes de 10, " + b5 + " billetes de 5, " 
            + m2 + " monedas de 2 euros y " + m1 + " monedas de 1 euro.");
            
    }
}
