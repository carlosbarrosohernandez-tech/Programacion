/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoej1;

/**
 *
 * @author carlo
 */
public class Pos_Neg {

    public static void comprobarSigno(int num) {
        //Calculamos si el numero es positivo o negativo
        if (num > 0) {
            System.out.println("El numero introducido es positivo");
        } else if (num < 0) {
            System.out.println("El numero introducido es negativo");
        } else {
            System.out.println("El numero introducido es 0, no es ni positivo ni negativo");
        }
    }
}