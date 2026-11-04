/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio18;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio18 {

    //pedimos el nombre al usuario
    public static String PedirNombre() {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        return nombre;
    }

    //mostramos el nombre 5 veces con un bucle
    public static void MostrarNombre(String nombre) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". " + nombre);
        }
    }

    public static void main(String[] args) {
        String nombre = PedirNombre();
        MostrarNombre(nombre);
    }

}
