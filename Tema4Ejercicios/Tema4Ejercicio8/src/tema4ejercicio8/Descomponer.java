/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio8;

/**
 *
 * @author carlo
 */
public class Descomponer {

    public static void descomponer(int euros) {
        //Declaramos las variables
        int bill_50, bill_20, bill_10, mon2;
        //Calculamos la descomposicion
        bill_50 = euros / 50;
        euros = euros - (50 * bill_50);

        bill_20 = euros / 20;
        euros = euros - (20 * bill_20);

        bill_10 = euros / 10;
        euros = euros - (10 * bill_10);

        mon2 = euros / 2;
        
        //La sacamos
        System.out.println("Billetes de 50: " + bill_50);
        System.out.println("Billetes de 20: " + bill_20);
        System.out.println("Billetes de 10: " + bill_10);
        System.out.println("Moendas de 2  euros: " + mon2);

    }
}
