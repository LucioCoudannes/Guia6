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
public class Eje21Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.*/

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        int[][] matrizP = new int[3][3];

        boolean bandera = false;
        

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                //Llenamos matriz original
                matriz[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print("| " + matriz[i][j] + " |");
            }
            System.out.println(" ");

        }

        System.out.println("");
        System.out.println("ingrese los valores de la matriz P");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                matrizP[i][j] = leer.nextInt();

            }

        }
        /*for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 8; j++) {
                
                int contador = 0;
                
                for (int k = 0; k < 3; k++) {
                    
                    for (int l = 0; l < 3; l++) {
                       
                        if (matriz[i + k][j + l] == matrizP[k][l]) {
                            contador++;
                        }
                        if (contador == 9) {
                            System.out.println("La matriz se encuentra en la posicion " + i + ", " + j + ".");
                            bandera=true;
                        }
                        
                        
                    }
                    
                }
                    
                
            }
            
        }*/
    


        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (matriz[i][j] == matrizP[0][0]) {
                    if (matriz[i][j + 1] == matrizP[0][1]) {
                        if (matriz[i][j + 2] == matrizP[0][2]) {
                            if (matriz[i + 1][j] == matrizP[1][0]) {
                                if (matriz[i + 1][j + 1] == matrizP[1][1]) {
                                    if (matriz[i + 1][j + 2] == matrizP[1][2]) {
                                        if (matriz[i + 2][j] == matrizP[2][0]) {
                                            if (matriz[i + 2][j + 1] == matrizP[2][1]) {
                                                if (matriz[i + 2][j + 2] == matrizP[2][2]) {
                                                    bandera = true;
                                                    System.out.println("las cordenadas de la matriz P son " + i + ", " + j);

                                                }
                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
        
        if (bandera==false) {
            
            System.out.println("No se encontro la matriz P en la matriz original");
            
        }

    }

}
