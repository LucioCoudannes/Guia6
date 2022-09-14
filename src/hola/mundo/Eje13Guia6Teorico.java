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
public class Eje13Guia6Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. */
        
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del equipo");
        
        int tam = leer.nextInt();
        
        String[] Equipo = new String [tam];
        
        
        for (int i = 0; i < tam; i++) {
            
            System.out.println("Ingrese los nombres de los jugadores");
            
            Equipo[i-1] = leer.nextLine();
            
            
            
        }
        
            System.out.println("");
            System.out.println("");
        
         for (int i = 0; i < tam; i++) {
            
            System.out.println(Equipo[i]);
            
                   
            
        }
       
        
        
        
    }
    
}
