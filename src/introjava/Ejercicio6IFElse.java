/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio6IFElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num2 = leer.nextInt();
        
        if (num1 > 25 || num2 >25) {
             System.out.println("Alguno de los numeros es MAYOR a 25");
        
        }else{
            System.out.println("alguno de los numeros son MENORES a 25");
        }
        
    }
    
}
