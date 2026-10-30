/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio6;

/**
 *
 * @author carlo
 */
public class Examenes {

    public static void examen(int nota) {
        //Depende de la nota q meta el usuario le saca una calificacion u otra
        if (nota <= 4 && nota >= 0) {
            System.out.println("Tu nota es un SUSPENSO");
        } else if (nota > 4 && nota <= 6) {
            System.out.println("Tu nota es un BIEN");
        } else if (nota > 6 && nota <= 8) {
            System.out.println("Tu nota es un NOTABLE");
        } else if (nota > 8 && nota <= 10) {
            System.out.println("Tu nota es un SOBRESALIENTE");
        } else {
            System.out.println("ERROR, Tienes que introducir una nota del 0 al 10...");
        }
            

    }

}
