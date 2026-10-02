/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Team3Ejercicio6 {
        public static void main(String[] args) {
           Scanner teclado = new Scanner (System.in);
           int nota;// declaramos variable
           
           System.out.println("Intorduce la nota del examen: ");
           nota = teclado.nextInt();
           //Calculamos que sacar depende de la nota y un ELSE por si mete algo mal
           if (nota >= 0 && nota <= 4) {
               System.out.println("Tu examen esta SUSPENSO");
           }
           else if (nota >= 5 && nota <= 6) {
               System.out.println("Tu examen esta BIEN");
           }
           else if (nota >= 7 && nota <= 8) {
               System.out.println("Tu examen es un NOTABLE");
           }
           else if (nota >= 9 && nota <= 10) {
               System.out.println("Tu examen es un SOBRESALIENTE");
           }
           else {
               System.out.println("La not que has introducido no esta entre 0 y 10");
           }
           
           
        }
}
