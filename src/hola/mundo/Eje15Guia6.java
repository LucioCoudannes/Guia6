/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

/**
 *
 * @author A288808
 */
public class Eje15Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.*/
        
        
               
        imprimirvector();
        
        
        
    }
    
    
    
   public static void imprimirvector(){
    
         int [] numeros = new int [101];
       
       
       for (int i = 0; i < 101; i++) {
            
            numeros[i] = i;
            
        }
       
       
       
      for (int i = 100; i > 0; i--) {
            
            System.out.println("[" + numeros[i] + "]");
            
        }
    
    
    }
}
    

