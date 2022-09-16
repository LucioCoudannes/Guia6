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
public class Eje13Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente*/
        
        Scanner leer = new Scanner(System.in);
    
        int elementos;
        
        System.out.println("Ingrese la cantidad de elementos");
        
        elementos = leer.nextInt();
        
        
        for (int i = 0; i <elementos; i++) {
                            
                        
            for (int j = 0; j < elementos; j++) {
                
                if(i==0 || i== elementos-1 || j==0 || j==elementos-1){                    
                    System.out.print("*");
                                   
                }
                
                else{
                    
                    System.out.print(" ");
                    
                }
            }
                System.out.println("");
                              
            }
            
            
        }
        
    
        
    }
    

