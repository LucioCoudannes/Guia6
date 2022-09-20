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
public class Eje17Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Recorrer un vector de N enteros contabilizando cuántos números
        son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
        //declaro scanner
        Scanner leer = new Scanner(System.in);
        //declaro vectores
        int[] vEnteros = new int[100000];
        int[] vContadorDigitos = new int[5];
        int digitos = 0;

        for (int i = 0; i < 100000; i++) {

            vEnteros[i] = (int) (Math.random() * (99999) + 1);
            
            digitos = (int) Math.log10(vEnteros[i]) + 1;

            vContadorDigitos[digitos - 1] = vContadorDigitos[digitos - 1] + 1;
            //System.out.print(" |" + vEnteros[i] + "|");
        }
        
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hay " + vContadorDigitos[i] + " numeros de " + (i + 1) + " digitos.");
        }

    }
    
}
