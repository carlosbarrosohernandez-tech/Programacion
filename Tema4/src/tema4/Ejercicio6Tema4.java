/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import metodoej6.Examenes;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio6Tema4 {

    public static void main(String[] args) {
        //declaramos variable
        int nota;
        Scanner entrada = new Scanner (System.in);
        //Pedimos la nota
        System.out.println("Introduce la nota del examen: ");
        nota = entrada.nextInt();
        //Llamamos al metodo
        Examenes.examen(nota);
    }

}
