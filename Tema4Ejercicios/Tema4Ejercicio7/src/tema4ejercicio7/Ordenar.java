/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio7;

/**
 *
 * @author carlo
 */
public class Ordenar {

    public static void main(int num1, int num2, int num3, int num4) {
        //con un for vamos recorriendo todos los numeros
        //y con la variable extra nos permite poder meter y sacar variables para ordenarlas
        int extra;
        for (int i = 1; i <= 3; i++) {
            if (num1 > num2) {
                extra = num1;
                num1 = num2;
                num2 = extra;
            }
            if (num2 > num3) {
                extra = num2;
                num2 = num3;
                num3 = extra;
            }
            if (num3 > num4) {
                extra = num3;
                num3 = num4;
                num4 = extra;
            }
        }

        System.out.println("El orden de los números introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
}
