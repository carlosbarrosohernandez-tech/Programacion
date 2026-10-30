/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio12;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio12 {
    
    final static int CLAVE = 1234;

    public static int pedirContrasena() {
        int contrasena;
        Scanner teclado = new Scanner(System.in);

        //pedimos la contraseña al usuario
        System.out.println("Introduce la contraseña:");
        contrasena = teclado.nextInt();
        return contrasena;
    }

    public static boolean comprobarContrasena(int contrasena) {

        //comprobamos si la contraseña es la correcta
        if (contrasena == CLAVE) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarResultado(boolean correcta) {
        //mostramos el resultado de la comprobacion
        if (correcta) {
            System.out.println("Enhorabuena, contraseña correcta.");
        } else {
            System.out.println("Error de acceso, has fallado 3 veces.");
        }
    }

    public static void main(String[] args) {
        int contrasena;
        boolean correcta;
        int intentos = 0;

        //se pide la contraseña hasta que acierte o falle 3 veces
        do {
            contrasena = pedirContrasena();
            correcta = comprobarContrasena(contrasena);
            intentos++;
            if (!correcta && intentos < 3) {
                System.out.println("Contraseña incorrecta, te quedan " + (3 - intentos) + " intentos.");
            }
        } while (!correcta && intentos < 3);

        mostrarResultado(correcta);
    }
}
