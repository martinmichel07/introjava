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
public class Ejercicio8While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
          
           
       while ( nota > 10 || nota <= 0){
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
       
       }
        
    }
    
}
