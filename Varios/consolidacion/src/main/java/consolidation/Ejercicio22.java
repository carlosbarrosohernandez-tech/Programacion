/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolidation;

/**
 *
 * @author carlo
 */
import java.util.Scanner; //importar Scanner para leer del teclado

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, area, perimetro;

        System.out.print("Por favor, introduzca la medida de un lado: ");
        lado = entrada.nextDouble(); //leer el lado

        area = (lado * lado * Math.sqrt(3)) / 4; //calcular area triangulo
        perimetro = lado * 3; //calcular perimetro (3 lados iguales)

        System.out.println("El área de un triángulo de lado: " + lado + " es: " + area);
        System.out.println("El perímetro de un triángulo de lado: " + lado + " es: " + perimetro);
    }
}
