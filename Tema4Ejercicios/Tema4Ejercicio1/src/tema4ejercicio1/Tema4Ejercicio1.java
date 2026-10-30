/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos la variable y pedimos el numero al usuario
        int num;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero: ");
        num = entrada.nextInt();
        //Sacamos la respuesta que se calcula en el metodo
        Pos_Neg.comprobarSigno(num);
        
        

    }
    
}
