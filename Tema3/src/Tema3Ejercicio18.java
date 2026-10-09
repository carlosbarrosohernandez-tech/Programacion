/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio18 {

    final static int clave = 1234; // Constante con la contraseña correcta

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int usuario;      // Contraseña que introduce el usuario
        int intentos = 0; // Contador de intentos

        do {
            //se le pide un intento y se suma un intento
            System.out.println("Introduce la contrasenia:");
            usuario = entrada.nextInt();
            intentos++;

            if (usuario == clave) {
                System.out.println("¡Enhorabuena! Contrasenia correcta.");
            } else if (intentos < 3) {
                System.out.println("Contrasenia incorrecta. Te quedan " + (3 - intentos) + " intentos.");
            } else {
                System.out.println("Error de acceso: has fallado 3 veces.");
            }
            //si adivina funciona si no te dice que no y q vuelvas a entrar. pero cuando sea < 3 pasa al else y ya te pone que has fallado 3 veces
        } while (usuario != clave && intentos < 3); //el bulce para si aciertas o fallas 3 veces
    }
}
