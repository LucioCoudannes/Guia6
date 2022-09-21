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
public class Eje20Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.*/
        
        Scanner leer = new Scanner(System.in);
        
        int col,fil,diag;
        boolean bandera=true;
        col=0;
        fil=0;
        diag=0;
        
        //Defino matriz
        int[][]matriz = new int [3][3];
        
        System.out.println("Ingrese los valores de la matriz");
        //llenamos matriz y sumamos, fila, columna y diagonal
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                matriz[i][j]=leer.nextInt();
                
                
               if(i==0){
                   
                   fil=fil+matriz[i][j];               
                   
               }
               
               if(j==0){
                   
                   col=col+matriz[i][j];
                   
               }
                if (i==j) {
                    
                    diag=diag+matriz[i][j];
                    
                }
                
                             
            }
            
        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("| " + matriz[i][j] + " |");
                
            }
            
            System.out.println(" ");
            
        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                if(matriz[i][j]>9 || matriz[i][j]<1){
                    
                    bandera=false;
                }
                
                
            }
            
        }
        
        if(bandera==false){
            
            System.out.println("Los valores ingresados deben ser entre 1 y 9");
            
        }
        else{
            
            if(fil==col && fil==diag){
            
            System.out.println("Es un cuadrado magico");}
        else {
            
            System.out.println("No es un cuadrado magico");
        }  
            
            
        }
        
        
      
            
               
    }
    
}
