/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Lucio_Coudannes
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //ejercicio video 1
        /*Scanner leer = new Scanner(System.in);
                
        String nombre;
        
        System.out.println("Ingresa tu nombre");
        
        nombre = leer.next();
        
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando JAVA!" );
        */
        
        //Ejercicio 1 Guia 6 Deteccion de errores
         /*       
        String nombre;
        boolean bandera;
        char Letra;*/
         
         //Ejercicio 2 Guia 6 Deteccion de errores
         /*
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;*/
         
         //Ejercio 3 Guia 6
         /*
         int num1 = 2;
         int num2 = 3;   
         int resultado;
         
         resultado = num1 + num2;
         
         double division = num2 / num1;
         
         int resta = num2 - num1;*/
         
        //Ejercicio 4 Guia 6
         /*String nombre = "Lucio";
         
         int edad;
         
         Scanner leer = new Scanner(System.in);
         
               
         System.out.println("Ingrese su edad");
         
         edad = leer.nextInt();
         
         System.out.println("Hola " + nombre + " tenes " + edad + " años");*/
         
         //Ejercicio 5 Guia 6
         
        /* Scanner leer = new Scanner (System.in);
                  
         double num1,num2;
         
         boolean prueba = false;
         
         char letra;
                  
         System.out.println("Ingrese un numero");
         
         num1 = leer.nextDouble();
         
         System.out.println("Ingrese un numero");
         
         num2 = leer.nextDouble();
         
         System.out.println("Ingrese una letra");
         
         letra = leer.next().charAt(0);
         
         System.out.println(letra);
         System.out.println(num1);
         System.out.println(num2);
         
         if (num1==num2)
             
             prueba = true;
         
          System.out.println("Los numeros son iguales " + prueba); */
         
         //ejercio 5 guia 6 deteccion de errores
         /*
            Scanner leer = new Scanner(System.in); 
            System.out.println("Ingresa tu edad");
            int edad = leer.nextInt();
            System.out.println("Ingresa tu nombre");
            String nombre = leer.next();*/
         
        //ejericio 6 guia 6
        
        /*Implementar un programa que le pida dos números enteros
        a usuario y determine si ambos o alguno de ellos es mayor a 25*/
        
       /* Scanner leer = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("Ingresa el primer numero");
        
        num1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo numero");
        
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25)
            
            System.out.println("Ambos numeros son mayores a 25");
        
        else if (num1 > 25 || num2 > 25)
            
            System.out.println("solo un numero es mayor a 25");
        
       else
               System.out.println("ningun numero es mayor a 25");*/
            
       //ejercicio 7 guia 6     
        /*Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos 
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y 
permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”. 
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de 
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de 
hormigón”. 
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta 
alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor 
válido para tipo de bomba”*/
        
        /*Scanner leer = new Scanner(System.in);
        
        int tipoMotor;
        
        System.out.println("Ingrese el tipo de motor con un numero del 1 al 4");
        
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            
            case 1: System.out.println("La bomba es una bomba de agua");
                break;
            case 2: System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3: System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            
            default: System.out.println("No existe un valor válido para tipo de bomba");}*/
          
        //Ejercicio 8 Guia 6
        
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
pedirá de nuevo hasta que la nota sea correcta. */
        
        /*Scanner leer = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Ingrese una nota");
        
        nota = leer.nextInt();
        
        while(nota <0 || nota >10){
        
           System.out.println("Nota invalida, ingrese un valor entre 0 y 10");
        
           nota = leer.nextInt();
           
        }
        
            System.out.println("La nota ingresada es correcta " + nota);*/
        
        //Ejercicio 9 guia 6
        
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.*/
        
        /*Scanner leer = new Scanner(System.in);

        int num, cont, suma;
        boolean bandera = true;

        suma = 0;
        cont = 0;

        do {
            System.out.println("Ingrese un numero");

            num = leer.nextInt();
            if (num == 0) {
                bandera = false;
                break;
            } else if (num > 0) {
                suma = suma + num;
            }
            cont++;

        } while (cont < 5);
        
        if (bandera == false){
            
            System.out.println("Se capturo el 0");}

        System.out.println("La suma de todos los valores ingresados es " + suma);*/
        
        //Ejercicio 10 guia 6
        
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor*/
        
       /* Scanner leer = new Scanner(System.in);
        
        int num,num1,num2,num3,num4;
        
        
        
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        
        System.out.print(num1);
        
        for (int i = 0; i < num1; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");
        
           System.out.print(num2);
        
        for (int i = 0; i < num2; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");
        
           System.out.print(num3);
        
        for (int i = 0; i < num3; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");
        
           System.out.print(num4);
        
        for (int i = 0; i < num4; i++) {
            
            System.out.print("*");
                        
            }
        
        System.out.println("");*/
       
        

    }

}
    
    
