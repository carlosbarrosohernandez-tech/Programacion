import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //pedimos la fecha actual
        System.out.print("Introduzca el año actual: ");
        int anioActual = entrada.nextInt();
        System.out.print("Introduzca el mes actual: ");
        int mesActual = entrada.nextInt();
        System.out.print("Introduzca el dia actual: ");
        int diaActual = entrada.nextInt();

        //pedimos la fecha de nacimiento
        System.out.print("Ahora, introduzca su año de nacimiento: ");
        int anioNac = entrada.nextInt();
        System.out.print("Introduzca su mes de nacimiento: ");
        int mesNac = entrada.nextInt();
        System.out.print("Por ultimo introduzca su dia de nacimiento: ");
        int diaNac = entrada.nextInt();

        //restamos cada parte por separado
        int anios = anioActual - anioNac;
        int meses = mesActual - mesNac;
        int dias = diaActual - diaNac;

        //si los dias salen negativos, cogemos prestado un mes (30 dias)
        if (dias < 0) {
            meses--;
            dias = dias + 30;
        }

        //si los meses salen negativos, cogemos prestado un año (12 meses)
        if (meses < 0) {
            anios--;
            meses = meses + 12;
        }

        System.out.println("Su edad exacta es de " + anios + " años, " + meses + " meses y " + dias + " dias.");
    }

}