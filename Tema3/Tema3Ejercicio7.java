/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio7 {
        public static void main(String[] args) {
            Scanner dia = new Scanner (System.in);
            int diasemana;
            boolean laborable = false;
            
            System.out.println("Introduce el dia que vas a trabajar: ");
            diasemana = dia.nextInt();
            
            switch (diasemana) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                     laborable=true;
                     break;
                case 6:
                case 7:
                     laborable=false;
                
            }
            if (diasemana >= 1 || diasemana <= 7) {    
                System.out.println("¿Ese dia trabajas?: " + laborable);
            }
            else {
                System.out.println("Introduce un numero del 1 al 7");
            }
            
        }    
}
