/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio20;

import java.util.Scanner;

/**
 *
 * @author carlo
 */

public class Tema4Ejercicio20 {
    
    public final static String PREGU1 = "Madrid";
    public final static String PREGU2 = "Colon";
    
    public static String Pregunta1() {
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("1ª PREGUNTA: ¿Cual es la capital de España?");
        respuesta = entrada.nextLine();
        return respuesta;
    }
    
    public static String Pregunta2() {
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("2ª PREGUNTA: ¿Quien descubrio America?");
        respuesta = entrada.nextLine();
        return respuesta;
    }
    
    public static void Comprobar(String respuesta1, String respuesta2) {
        if (!respuesta1.equals(PREGU1)) {
            System.out.println("No es correcto. La respuesta correcta seria: " + PREGU1);
        } else {
            System.out.println("Muy bien, respuesta correcta");
        }
        
        if (!respuesta2.equals(PREGU2)) {
            System.out.println("No es correcto. La respuesta correcta seria: " + PREGU2);
        } else {
            System.out.println("Muy bien, respuesta correcta");
        }
    
}
    
    


    public static void main(String[] args) {

    }
    
}
