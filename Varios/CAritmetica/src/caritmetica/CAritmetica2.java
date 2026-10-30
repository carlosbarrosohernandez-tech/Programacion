/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caritmetica;

/**
 *
 * @author carlo
 */
public class CAritmetica2 {
  
    /**
     * @author Oscar Laguna García
     * Operaciones Aritméticas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1; //Declaro la variable entera dato1
        int dato2, resultado; //Declaro, a la vez, dos variables enteras: dato2 y resultado
        int dato3; //Declaro mi nueva variable que me pide el ejercicio
        
        dato1 = 20; //Asigno el valor 20 a la variable dato1
        dato2 = 10;
        dato3 = 5; //le asigno el valor 5

        //Suma
        resultado = dato1 + dato2 + dato3; //Guardo la suma de las tres variables en la variable resultado
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado); /* El método println escribe
        por pantalla tanto el valor de las variables asi como las cadenas que están entre
        comillas. Para unir los 5 elementos se ha utilizado el operador + */

        //Resta
        resultado = dato1 - dato2 - dato3; //Lo mismo pero añadiendo el dato3 y asi con todo
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);

        //Producto
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);

        //Cociente
        resultado = dato1 / dato2 / dato3;
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado);
    }

}  
