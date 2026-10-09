
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carlo
 */
public class Tema3Ejercicio24 {

    public static void main(String[] args) {
        int num1, num2, total=0; //declaro variables
        Scanner entrada = new Scanner(System.in);
//hago un do while que te obliga a meter si o si un numero mayor q 0
        do {
            System.out.println("Introduce un numero mayor que 0: ");
            num2 = entrada.nextInt();
            if (num2 <= 0) {
                System.out.println("Error: tienes que introducir un numero mayor que 0");
            }
        } while (num2 <= 0);
        //si el numero es mayor que cero el for calcula la suma y luego lo saco con print
        System.out.println("Los multiplos de 3 entre 1 y " + num2 + " son:");

        for (num1 = 1; num1 <= num2; num1++) {
            if (num1 % 3 == 0) {
                total++;
                System.out.println(num1);
            }

        }
        System.out.println("El numero total de numeros mostrados es: " + total);

    }
}
