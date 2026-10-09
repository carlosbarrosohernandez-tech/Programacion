/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio28 {

    public static void main(String[] args) {
        double aleatorio = Math.floor((Math.random()*100+1));
        int aleatorioEntero = (int) aleatorio;
        
        if (aleatorioEntero % 2 == 0) {
            System.out.println("El numero que te a tocado es par: " + aleatorioEntero);
        } else {
            System.out.println("El numero que te a tocado es impar: " + aleatorioEntero);
        }
        

    }

}
