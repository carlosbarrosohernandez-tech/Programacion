/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoej8;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio8Tema4 {

    public static void main(String[] args) {
        //Declaramos variable
        int euros;
        Scanner entrada = new Scanner(System.in);
        //Pedimos el dinero
        System.out.println("Por favor, indique una cantidad de dinero: ");
        euros = entrada.nextInt();
        //Sacamos la descomposicion llamando al metodo
        System.out.println(euros + " Euros se descompone en: ");
        Descomponer.descomponer(euros);

    }

}
