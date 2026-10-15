/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio31 {

    public static void main(String[] args) {
        //creo las variables necesarias
        int numero;
        int cantidad = 0;
        int impares = 0;
        //aqui guardo los tres impares para mostrarlos al final
        int impar1 = 0, impar2 = 0, impar3 = 0;

        //se repite hasta conseguir 3 impares
        while (impares < 3) {
            numero = (int) (Math.random() * 100) + 1;
            cantidad++;

            if (numero % 2 != 0) {
                impares++;
                //segun cuantos impares llevo, lo guardo en una variable u otra
                if (impares == 1) {
                    impar1 = numero;
                } else if (impares == 2) {
                    impar2 = numero;
                } else {
                    impar3 = numero;
                }
            }
        }

        //al final mostramos los resultados
        System.out.println("Los tres numeros impares son: " + impar1 + ", " + impar2 + " y " + impar3);
        System.out.println("Cantidad de numeros generados: " + cantidad);
    }

}
