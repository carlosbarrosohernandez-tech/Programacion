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
    //Constantes
    public final static String PREGU1 = "Madrid";
    public final static String PREGU2 = "Colon";
    //Pedimos las dos respuestas
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
    //Depende de si acierta pos se le pone una nota u otra
    public static int Nota(String pregunta1, String pregunta2) {
        int nota;
        if (pregunta1.equals(PREGU1) && pregunta2.equals(PREGU2)) {
            nota = 10;
        } else if (pregunta1.equals(PREGU1) || pregunta2.equals(PREGU2)) {
            nota = 5;
        } else {
            nota = 0;
        }
        return nota;
    }
    //Se comprueba
    public static void Comprobar(String respuesta, String correcta) {
        if (!respuesta.equals(correcta)) {
            System.out.println("No es correcto. La respuesta correcta seria: " + correcta);
        } else {
            System.out.println("Muy bien, respuesta correcta");
        }
    }
    //Se saca en el main llamando a los metodos
    public static void main(String[] args) {
        System.out.println("EXAMEN DE CULTURA GENERAL");

        String respuesta1 = Pregunta1();
        Comprobar(respuesta1, PREGU1);

        String respuesta2 = Pregunta2();
        Comprobar(respuesta2, PREGU2);

        int nota = Nota(respuesta1, respuesta2);
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }

}
