/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolidation;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double programacion, marcas, basesDatos, entornos, sistemas, fol, media;

        //pedir las 6 notas
        System.out.print("Por favor, introduzca la nota de Programación: ");
        programacion = entrada.nextDouble();
        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        marcas = entrada.nextDouble();
        System.out.print("Introduzca la nota de Bases de Datos: ");
        basesDatos = entrada.nextDouble();
        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        entornos = entrada.nextDouble();
        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        sistemas = entrada.nextDouble();
        System.out.print("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        fol = entrada.nextDouble();

        media = (programacion + marcas + basesDatos + entornos + sistemas + fol) / 6; //sumar notas y dividir entre 6

        System.out.println("Su nota media del curso es de: " + media);
    }
}
