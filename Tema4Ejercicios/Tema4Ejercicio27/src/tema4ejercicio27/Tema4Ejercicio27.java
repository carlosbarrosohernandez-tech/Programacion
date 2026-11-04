/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio27;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio27 {

    //pedimos cara o cruz al usuario
    public static String PedirEleccion() {
        String eleccion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige cara o cruz: ");
        eleccion = entrada.nextLine();
        return eleccion;
    }

    //tiramos la moneda, si sale 0 es cara y si sale 1 es cruz
    public static String TirarMoneda() {
        int aleatorio = (int) (Math.random() * 2);
        if (aleatorio == 0) {
            return "cara";
        } else {
            return "cruz";
        }
    }

    public static void main(String[] args) {
        String eleccion, resultado;

        //se repite hasta que acierte
        do {
            eleccion = PedirEleccion();
            resultado = TirarMoneda();
            System.out.println("Ha salido: " + resultado);

            if (eleccion.equals(resultado)) {
                System.out.println("Enhorabuena, has acertado!!");
            } else {
                System.out.println("Has perdido, vuelve a intentarlo");
            }
        } while (!eleccion.equals(resultado));
    }

}
