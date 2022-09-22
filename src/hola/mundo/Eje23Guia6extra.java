/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Eje23Guia6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  . Construya un programa que lea 5 palabras, de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada. 
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().  */

        Scanner leer = new Scanner(System.in);
         Random random = new Random();

        String[][] sopa = new String[20][20];

        String[] palabras = new String[5];

        int fila, contador, columna;
        char llenador;
        String palabra;

        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                //llenador=(int) (Math.random() * 9 + 1);
                
                llenador= (char) (random.nextInt(26) + 'a');
                sopa[i][j]=String.valueOf(llenador);
                
            }
            
        }
        
        
        

        for (int i = 0; i < 5; i++) {

            do {
                System.out.println("Carguemos la palabra " + (i + 1));
                palabras[i] = leer.nextLine();
            } while (palabras[i].length() < 3 || palabras[i].length() > 5);
            
            fila=(int) (Math.random()* 19 + 1);
            columna=(int) (Math.random()* 15 + 1);
            for (int j = 0; j < palabras[i].length(); j++) {
                
              sopa[fila][columna+j]=palabras[i].substring(j,j+1);  
                
                
            }
        }
        
        
             for (int j = 0; j < 20; j++) {
                 
                 for (int k = 0; k < 20; k++) {
                     
                     System.out.print("| " + sopa[j][k] + " |");
                     
                 }
                 
                 System.out.println("");
                
            }
      
            
            
        
        
        

    }

}
