/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author carlo
 */
public class Asignatura {
            public static void main(String[] args) {
            
            String asignatura;
            asignatura = "biologia";  //Creo la variable de la asignatura
            
            int examen1;  //Creo la variable de la primera nota
            examen1 = 5;
                    
            int examen2; //Variable de la segunda nota
            examen2 = 10;
            
            float media;  //variable de la MEDIA de los dos examenes
            media = (examen1 + examen2) / 2F;
            
            System.out.println("En " + asignatura + " e sacado de media un; " + media);
            //Hacemos un system out donde saca la media
            }
    
}
