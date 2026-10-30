/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolidation;

/**
 *
 * @author carlo
 */

import java.util.Scanner;

public class Ejercicio28 {

    final static int BITS_POR_BYTE = 8; //constante: 1 byte son 8 bits
    final static int SEGUNDOS_MINUTO = 60; //constante: 1 minuto son 60 segundos

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tamanioMB, velocidad, megabits, segundos, minutos;

        System.out.print("Por favor, introduzca el tamaño del archivo en MB: ");
        tamanioMB = entrada.nextDouble();
        System.out.print("Introduzca la velocidad de su ADSL en megabits: ");
        velocidad = entrada.nextDouble();

        megabits = tamanioMB * BITS_POR_BYTE; //pasar MB a megabits
        segundos = megabits / velocidad; //tiempo en segundos
        minutos = segundos / SEGUNDOS_MINUTO; //pasar segundos a minutos

        System.out.println("Tardará " + minutos + " minutos en descargar el archivo.");
    }
}
