
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio29 {

    public static void main(String[] args) {
        int num, intentos=0;//Asignamos variables
        //Esto lo que hace es que el numero al azar no salga con decimales
        double aleatorio = Math.floor((Math.random() * 100 + 1));
        int aleatorioEntero = (int) aleatorio;
        Scanner entrada = new Scanner (System.in);
        //hacemos el bucle do while para que no pare hasta que el usuario adivine el numero
        do {
            System.out.println("Adivina el numero del 1 al 100: ");
            num = entrada.nextInt();
            //ponemos intentos aqui para que cada vez que haga un intento (scanner) se sume un intento
            intentos++;
            
            if (aleatorioEntero > num) {
                System.out.println("El numero es mayor...");
            }
            else if (aleatorioEntero < num) {
                System.out.println("El numero es menor...");
            }
            else {
                System.out.println("Has adivinado el numero");
            }
        } while (aleatorioEntero != num);
        //Lo sacamos por pantalla
        System.out.println("El numero era: " + aleatorioEntero + " y lo has hecho en: " + intentos + " intentos");
    }

}
