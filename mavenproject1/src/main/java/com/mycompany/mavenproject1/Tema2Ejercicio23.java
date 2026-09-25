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

public class Tema2Ejercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio, total;
        int unidades;

        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = entrada.nextDouble(); //leer precio (con decimales)
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        unidades = entrada.nextInt(); //leer unidades (numero entero)

        total = precio * unidades; //calcular total de la compra

        System.out.println("El precio total de su compra es de: " + total + " Euros.");
    }
}
