import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio30 {

    public static void main(String[] args) {
        //num empieza en 0 porque el aleatorio va del 1 al 100, asi nunca coincide al principio
        int num = 0, intentos = 0;
        //Esto lo que hace es que el numero al azar no salga con decimales
        double aleatorio = Math.floor((Math.random() * 100 + 1));
        int aleatorioEntero = (int) aleatorio;
        Scanner entrada = new Scanner(System.in);
        //hacemos el bucle do while para que no pare hasta que el usuario adivine el numero
        do {
            System.out.println("Adivina el numero del 1 al 100: ");
            //se suma fuera del try-catch para que cuente siempre, meta un numero o una letra
            intentos++;
            try {
                num = entrada.nextInt();

                if (aleatorioEntero > num) {
                    System.out.println("El numero es mayor...");
                }
                else if (aleatorioEntero < num) {
                    System.out.println("El numero es menor...");
                }
                else {
                    System.out.println("Has adivinado el numero");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: eso no es un numero. Se cuenta como intento.");
                entrada.next();
            }
        } while (aleatorioEntero != num);
        //Lo sacamos por pantalla
        System.out.println("El numero era: " + aleatorioEntero + " y lo has hecho en: " + intentos + " intentos");
    }

}