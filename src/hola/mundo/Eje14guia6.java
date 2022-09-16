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
public class Eje14guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).*/
        
        Scanner leer = new Scanner(System.in);
        
        String tipomoneda;
        
        double cant, dolar, libra, yen;
        
        int opcion;
        
        tipomoneda=" ";
        
        dolar = 1.5;
        libra = 2;
        yen = 0.5;
        
        
        System.out.println("Ingrese la cantidad de dinero a convertir");
        
        cant = leer.nextInt();
        
        
         do {
        System.out.println("indique la moneda requerida");
        System.out.println("MENU");
        System.out.println("1. DOLAR");
        System.out.println("2. LIBRA");
        System.out.println("3. YEN");
        
       
            
            
        opcion = leer.nextInt();
        
        
          switch (opcion){
           
           case 1 : tipomoneda="dolar";
           break;
           case 2 : tipomoneda="libra";
           break;
           case 3 : tipomoneda="yen";
           break;
           default : System.out.println("lea bien las opciones");
           break;
       }
            
            
        } while (opcion!=1&&opcion!=2&&opcion!=3);
        
       
                
           convertir(tipomoneda,cant);
           
        
        
        
    }
    
    
    public static void convertir (String tipomoneda, double cant){
        
        if(tipomoneda=="dolar"){
            
            cant= cant * 1.5;
        }
            
        if(tipomoneda=="libra"){
            
            cant = cant * 2;
            
        }
        if(tipomoneda=="yen"){
            
            cant = cant * 0.5;
            
        }
        
        
        System.out.println("El cambio realizado equivale a " + cant + " " + tipomoneda);
    
    }
    
    
}
