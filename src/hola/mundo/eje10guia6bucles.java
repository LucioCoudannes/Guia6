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
public class eje10guia6bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Escriba un programa en el cual se ingrese un valor límite
        positivo, y a continuación solicite números al usuario hasta
        que la suma de los números introducidos supere el límite inicial. */
        
        Scanner leer = new Scanner(System.in);
        
        int num, suma, limite;
        
        suma = 0;
        
            
           System.out.println("Ingrese un numero limite");
           
           limite = leer.nextInt();
          if (limite < suma){
          
              System.out.println("El numero ingresado es negativo");
          
          } 
          else{
          
          while( suma <= limite ){
          
          System.out.println("Ingrese otro numero");
          
          num = leer.nextInt();
                    
          suma = suma + num;
          
          System.out.println("El valor sumado es " + suma);
          
          }}
              
              
        
    }
    
}
