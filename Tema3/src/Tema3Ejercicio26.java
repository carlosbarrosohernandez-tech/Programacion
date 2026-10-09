/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio26 {

    public static void main(String[] args) {
        // Lo mismo que el 25 solo que para numeros impares
        int num1, num2 = 222, suma = 0;
        for (num1 = 111; num1 <= num2; num1++) {
            //usamos != porq queremos impares
            if (num1 % 2 != 0) {
                suma = suma + num1;
            }
        }
        System.out.println("La suma total de los numeros impares es: " + suma);

    }

}
