/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio17;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio17 {

    //pide la letra al usuario
    public static char pedirLetra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una letra minuscula: ");
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }

    //genera una letra aleatoria entre la a (97) y la z (122)
    public static char random() {
        double aleatorio = Math.floor(Math.random() * 26 + 97);
        char letraAleatoria = (char) aleatorio;
        return letraAleatoria;
    }

    //compara la letra secreta con la del usuario
    public static void comprobar(char secreta, char letra) {
        if (secreta > letra) {
            System.out.println("La letra esta despues en el alfabeto...");
        } else if (secreta < letra) {
            System.out.println("La letra esta antes en el alfabeto...");
        } else {
            System.out.println("Has adivinado la letra!!");
        }
    }

    public static void main(String[] args) {
        char secreta, letra;
        int intentos = 0;
        secreta = random();
        //se repite hasta que acierte la letra
        do {
            letra = pedirLetra();
            intentos++;
            comprobar(secreta, letra);
        } while (letra != secreta);
        System.out.println("Has necesitado " + intentos + " intentos");
    }

}