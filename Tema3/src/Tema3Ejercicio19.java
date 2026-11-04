/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Tema3Ejercicio19 {

    public static void main(String[] args) {
        //en vez del break usamos un boolean que hace que el bucle pare
        boolean salir = false;

        for (int i = 0; i < 10 && !salir; i++) {
            System.out.println("Este es el numero" + i);
            if (i == 5) {
                salir = true; //cuando llega al 5 ya no vuelve a entrar al bucle
            }
        }
    }
}
