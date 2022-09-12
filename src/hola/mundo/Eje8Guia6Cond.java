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
public class Eje8Guia6Cond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 8 guia 6 Condicionales
        
        /* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.*/
        
        Scanner leer = new Scanner (System.in);
        
        String palabra;
        
        System.out.println("Ingrese una palabra");
        
        palabra = leer.next();
        
        if (palabra.length() == 8){
        
            System.out.println("CORRECTO");
        }
        
        else {
        
            System.out.println("INCORRECTO");
        }
            
        
        
        
        
        
    }
    
}
