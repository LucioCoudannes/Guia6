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
public class Eje16Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y
        le pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
        encuentra el numero y si se encuentra repetido*/
        
        Scanner leer = new Scanner(System.in);
        
        int n, buscado, contador;
        
        contador=0;
        
        int[] numeros, posiciones;
        
        System.out.println("Ingrese el tamaño del vector");
        
        n = leer.nextInt();
        
        numeros = new int [n];
        posiciones = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            numeros[i]= (int) (Math.random()* 9 + 1);
              
            System.out.println(numeros[i]);
                                  
        }
        
        System.out.println("Ingrese el valor buscado");
        
        buscado=leer.nextInt();
        
        
        
        for (int i = 0; i < n; i++) {
            
            if (buscado==numeros[i]) {
                
                
                posiciones[contador]=i;  
                contador++;
                          
                
               // System.out.println(contador + " " + posiciones[i]);
                
            }
            
            
        }
        
        System.out.println("El valor buscado se encontro " + contador + " veces");
         System.out.println(" ");
         
        System.out.print("en las posiciones ");
        for (int i = 0; i < contador; i++) {
            
            System.out.print(posiciones[i] + ", ");
            
        }
        
        
        
        
    }
    
}
