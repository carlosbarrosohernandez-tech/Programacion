/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio19;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio19 {

    public static String PedirDia() {
        String dia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un dia de la semana: ");
        dia = entrada.nextLine();
        return dia;
    }

    public static String ComMos(String dia) {
        String posicion;
        switch (dia) {
            case "Lunes":
                posicion = "primer";
                break;
            case "Martes":
                posicion = "segundo";
                break;
            case "Miércoles":
            case "Miercoles":
                posicion = "tercer";
                break;
            case "Jueves":
                posicion = "cuarto";
                break;
            case "Viernes":
                posicion = "quinto";
                break;
            case "Sábado":
            case "Sabado":
                posicion = "sexto";
                break;
            case "Domingo":
                posicion = "séptimo";
                break;
            default:
                posicion = "";
        }
        return posicion;
    }

    public static void main(String[] args) {
        String dia = PedirDia();
        String posicion = ComMos(dia);

        if (posicion.equals("")) {
            System.out.println(dia + " no es un dia de la semana");
        } else {
            System.out.println("El " + dia + " es el " + posicion + " dia de la semana");
        }
    }
}
