/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio20 {

    public static void main(String[] args) {
        //muestra los numeros del 1 al 10 saltandose el 5 pero sin el continue
        int i = 0;

        while (i < 10) {
            i++;
            if (i != 5) { //solo imprime si no es el 5
                System.out.println(i);
            }
        }
    }
}
