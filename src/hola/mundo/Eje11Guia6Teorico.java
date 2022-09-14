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
public class Eje11Guia6Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        
        frase = leer.nextLine();
        
        System.out.println(frase);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(codigo(frase));
        
        
        
        
        
        
    }
    
    public static String codigo(String frase){
        
        String decode = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            switch (frase.charAt(i)) {
                    case 'a':
                    decode = decode.concat("@");
                    break;
                    case 'e':
                    decode = decode.concat("#");
                    break;
                    case 'i':
                    decode =   decode.concat("$");
                    break;
                    case 'o':
                    decode =   decode.concat("%");
                    break;
                    case 'u':
                    decode =   decode.concat("*");
                    break;
                    case '.':
                    return decode.concat(".");
                   
                default:
                    decode = decode.concat(frase.substring(i,i+1));
                    
            }
            
        }
        
        
        return decode;
        
    } 
    
}
