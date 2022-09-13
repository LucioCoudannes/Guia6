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
public class Eje11giua6bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, opcion, suma, resta, mult;
        float div;
        String op;
        
        op = "n";
        
        System.out.println("Ingrese el primer numero");
        
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        
        num2 = leer.nextInt();
        
        while(!op.equals("s")){
        
            System.out.println("MENU");
             System.out.println("1. SUMAR");
             System.out.println("2. RESTAR");
             System.out.println("3. MULTIPLICAR");
             System.out.println("4. DIVIDIR");
             System.out.println("5. SALIR");
             System.out.println("ELIJA OPCION");
             
           opcion = leer.nextInt();
          
             
             
             
                 
        switch (opcion){
                case 1: suma = num1 + num2;
                System.out.println("La suma de ambos numeros es " + suma);
                break;
                case 2: resta = num1 - num2;
                System.out.println("La resta de ambos numeros es " + resta);
                break;
                case 3: mult = num1 * num2;
                System.out.println("La multiplicacion de ambos numeros es " + mult);
                break;
                case 4: div = num1 / num2;
                System.out.println("La division de ambos numeros es " + div);
                break;
                case 5: 
                System.out.println("Esta seguro que desea salir indique S/N");
                  op = leer.next();
                  
                                 
        }
        
    }
    
}}
