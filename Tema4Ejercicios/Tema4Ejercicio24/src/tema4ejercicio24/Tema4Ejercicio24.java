/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio24;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio24 {

    //pedimos el nombre al usuario
    public static String PedirNombre() {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        return nombre;
    }

    //pedimos la edad al usuario
    public static int PedirEdad() {
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad = entrada.nextInt();
        return edad;
    }

    //comprobamos si es mayor de edad o no
    public static void mayorDeEdad(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println("El usuario " + nombre + " es mayor de edad");
        } else {
            System.out.println("El usuario " + nombre + " no es mayor de edad");
        }
    }

    public static void main(String[] args) {
        String nombre = PedirNombre();
        int edad = PedirEdad();
        mayorDeEdad(nombre, edad);
    }

}
