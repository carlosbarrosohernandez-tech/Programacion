/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio25;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio25 {

    //metodo para pedir un numero al usuario
    public static double PedirNumero(String mensaje) {
        double numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        numero = entrada.nextDouble();
        return numero;
    }

    //calcula a elevado a b
    public static double Potencia(double a, double b) {
        double resultado;
        resultado = Math.pow(a, b);
        return resultado;
    }

    public static void main(String[] args) {
        double a, b, resultado;
        a = PedirNumero("Introduce la base (a): ");
        b = PedirNumero("Introduce el exponente (b): ");

        //si a es 0 y b es negativo da infinito, asi que lo controlamos
        if (a == 0 && b < 0) {
            System.out.println("Error: 0 elevado a un numero negativo es infinito");
        } else {
            resultado = Potencia(a, b);
            System.out.println(a + " elevado a " + b + " es: " + resultado);
        }
    }

}
