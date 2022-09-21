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
public class Eje18Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios
        y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
        se denota por B y se obtiene cambiando sus filas por columnas (o viceversa)*/
        
        
        
        //Declaramos matriz
        int[][] matriz = new int[4][4];
        //Declaro matriz transpuesta
        int[][] matrizT = new int [4][4];
        
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                //Llenamos matriz original
                matriz[i][j]= (int) (Math.random()* 9 + 1);
                //Transponemos matriz
                matrizT[j][i]= matriz[i][j];
                
            }
            
        }
        
        System.out.println("Matriz");
        
        imprimirmatriz(matriz);
        
        System.out.println("Matriz Transpuesta");
        
        imprimirmatriz(matrizT);
        
        
        
      
        
        
    }
    
    public static void imprimirmatriz(int[][] matriz){
    
      for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print("| " + matriz[i][j]+ " |");
                
            }
            System.out.println(" ");
        }
    
    
}
    
    
    
    
}
