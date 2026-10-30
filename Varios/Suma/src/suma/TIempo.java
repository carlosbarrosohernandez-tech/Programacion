/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author carlo
 */
public class TIempo {
    public static void main(String[] args) {
        int tiempo;
        tiempo = 10000;
        
        int horas = tiempo/3600;
        
        
        int minutos;
        minutos = (tiempo % 3600) / 60;
        
        int segundos;
        segundos = tiempo % 60;
        
        System.out.println("10000 segundos hacen un total de: " + horas + " horas, " + minutos + " minutos, y " + segundos + " segundos");
    }
    
}
