/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio16;

/**
 *
 * @author carlo
 */
public class Tema4Ejercicio16 {
    
    //Es crear una clase pa cada uno y poner su calculo con Math.

    public static double raizCuad() {
        double raiz = 64;
        raiz = Math.sqrt(raiz);
        return raiz;
    }

    public static double elevadoCub() {
        double num = 8;
        num = Math.pow(num, 3);
        return num;
    }

    public static double exponencialDos() {
        double num = 2;
        num = Math.exp(num);
        return num;
    }

    public static double logarithm() {
        double num = 2.71828;
        num = Math.log(num);
        return num;
    }

    public static double menorVal() {
        double num1 = 2, num2 = 3, menor;
        menor = Math.min(num1, num2);
        return menor;

    }

    public static double valorAbs() {
        double num = -4.5;
        num = Math.abs(num);
        return num;
    }

    public static double redondear() {
        double num = -4.5;
        num = Math.round(num);
        return num;

    }

    public static double senGr() {
        double num = 45;
        num = num * Math.PI / 180;
        num = Math.sin(num);
        return num;
    }
    //Sacarlo todo por pantalla
    public static void main(String[] args) {
        System.out.println("Raiz cuadrada de 64: " + raizCuad());
        System.out.println("8 elevado al cubo: " + elevadoCub());
        System.out.println("Exponencial de 2: " + exponencialDos());
        System.out.println("Logaritmo de 2,71828: " + logarithm());
        System.out.println("Menor valor entre 2 y 3: " + menorVal());
        System.out.println("Valor absoluto de -4,5: " + valorAbs());
        System.out.println("Redondeando -4,5 con round: " + redondear());
        System.out.println("Seno de 45 grados: " + senGr());
    }

}
