/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author carlo
 */
public class Vasos {
        public static void main(String[] args) {
            int num1; //Vaso 1
            num1 = 1;
            
            int num2; //Vaso2
            num2 = 2;
            
            int extra = num1; //Creamos variable extra para poder pasar los datos
            num1 = num2;
            num2 = extra;
            
            System.out.println("La variable num1 contiene el valor " + num2 + " y la variable num2 contiene el valor " + num1);
            System.out.println("Ahora, la variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 );
           
                    
                    
        
        }
    
}
