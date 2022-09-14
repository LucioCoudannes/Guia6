/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Eje12Guia6Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el primer numero");
        
        int num1 = leer.nextInt();
        
         System.out.println("Ingrese el segundo numero");
        
        int num2 = leer.nextInt(); 
        
        esmultiplo(num1,num2);
        
    }
    
    
    public static void esmultiplo(int a, int b){
        
        if (a % b == 0) {
            
            System.out.println("El primer numero es multiplo del segundo");
            
        }
        
        else{
            
            System.out.println("No es multiplo");
        }
        
        
        
    }
            
            
    
    
}
