/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio4;

/**
 *
 * @author carlo
 */
public class Menor {

    public static void menor(int num1, int num2, int num3) {
        //Comparamos los numeros para que saque al menor
        if (num1 < num2 && num1 < num3) {
            System.out.println("El numero menor de los introducidos es el: " + num1);

        } else if (num2 < num1 && num2 < num3) {
            System.out.println("El numero menor de los introducidos es el: " + num2);
        } else {
            System.out.println("El numero menor de los introducidos es el: " + num3);
        }
    }

}

