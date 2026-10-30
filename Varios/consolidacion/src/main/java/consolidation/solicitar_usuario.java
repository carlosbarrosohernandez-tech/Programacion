package consolidation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class solicitar_usuario {
        public static void main(String[] args) {
        Scanner segun = new Scanner(System.in);
        int tiempo;
        
        System.out.println("Intoruzca los segundos que quieres calcular: ");
        System.out.println("Segundos: ");
        tiempo = segun.nextInt();
        
        int horas = tiempo/3600;
        
        
        int minutos;
        minutos = (tiempo % 3600) / 60;
        
        int segundos;
        segundos = tiempo % 60;
        
        System.out.println("Eso son: " + horas + " horas, " + minutos + " minutos " + "y " + segundos + " segundos");
        
        
        
        
        
        
    }
    
}

