/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author carlo
 */
public class Cartera {
        public static void main(String[] args) {
            int cartera;
            int billete50, billete10;
            
            cartera = 130;
            billete50 = cartera / 50;
            billete10 = (cartera % 50) / 10;
            
            System.out.println("130 euros hacen un total de: " + billete50 + " billetes de 50 euros y " + billete10 + " billetes de 10 euros");
            
            
        }
    
}
