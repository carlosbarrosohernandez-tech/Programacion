/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio16 {

    public static void main(String[] args) {
        //declaracion de variables
        int contadorImpares = 0;
        int i;
        //puse el print aqui para qye salga como pedia el ejercicio (aunq daba igual)
        System.out.print("Los numeros impares existentes entre el numero 20 y el 160 son: ");
        for (i = 21; i <= 160; i += 2) { //Hacemos un bucle que hace que squemos los impares

            if (i % 2 != 0) { //esto sirve para contar los impares que van saliendo pa luego hacer el print
                contadorImpares++;

            }
            System.out.print(i + " - "); //Este esta dentro del bucle para que salga todo seguido

        }
        System.out.println("");
        System.out.println("La cantidad de numeros impares impresos han sido: " + contadorImpares);
    }
}
