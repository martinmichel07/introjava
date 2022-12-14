/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner; //Se imoporta el objeto Scanner para ingresar por teclado



/**
 *
 * @author A308763
 */
public class Ejercicio5Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); //Se declara un nueva Scanner
        
        System.out.println("Ingrese un valor boleano");
        boolean bandera = leer.nextBoolean();
        
        System.out.println("Ingrese un valor decimal");
        double decimal = leer.nextDouble();
        
        System.out.println("Ingrese un caracter simple");
        String caracter = leer.nextLine();
        
        

        
    }
    
}
