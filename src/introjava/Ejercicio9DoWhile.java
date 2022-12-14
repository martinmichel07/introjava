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
public class Ejercicio9DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int total = 0;
        int contador = 0;
                
                
        do{
            
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            
            if (numero == 0){
                System.out.println("Se capturo el numero CERO");
                break;
            }else if (numero < 0){
                
            }else{
                total = total + numero;
            }
            contador = contador + 1;

        } while (contador < 20);
        
        System.out.println("El resultado es: " + total);
    }
    
}
