import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio34 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //pedimos los datos de salida
        System.out.print("Dia de salida: ");
        int diaSalida = entrada.nextInt();
        System.out.print("Hora de salida: ");
        int horaSalida = entrada.nextInt();
        System.out.print("Minuto de salida: ");
        int minSalida = entrada.nextInt();

        //pedimos los datos de llegada
        System.out.print("Dia de llegada: ");
        int diaLlegada = entrada.nextInt();
        System.out.print("Hora de llegada: ");
        int horaLlegada = entrada.nextInt();
        System.out.print("Minuto de llegada: ");
        int minLlegada = entrada.nextInt();

        //pasamos todo a minutos para poder restar facilmente
        int totalSalida = diaSalida * 24 * 60 + horaSalida * 60 + minSalida;
        int totalLlegada = diaLlegada * 24 * 60 + horaLlegada * 60 + minLlegada;
        int duracion = totalLlegada - totalSalida;

        //si sale negativo, el tren habria llegado antes de salir
        if (duracion < 0) {
            System.out.println("Error: la hora de llegada no puede ser anterior a la de salida.");
        } else {
            int horas = duracion / 60;
            int minutos = duracion % 60;
            System.out.println("El tren tarda " + horas + " horas y " + minutos + " minutos.");
        }
    }

}