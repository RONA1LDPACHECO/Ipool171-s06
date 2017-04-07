/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S6 {
   
    public static void main(String[] args) 
    {
        System.out.println("Ejercicio s06");
        System.out.println("");
        
       String Nombre01 = "";
       int Cantidad01 =0;
       double Precio01 =0;
       
       String Nombre02 = "";
       int Cantidad02 =0;
       double Precio02 =0;
       
       String Nombre03 = "";
       int Cantidad03;
        Cantidad03 =0;
       double Precio03 =0;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("ingrese \"Nombre\"Producto 01:");
       Nombre01 = sc.next();
       
       System.out.println("ingrese \"Cantidad\"Producto 01:");
       Cantidad01 = sc.nextInt();
       
       System.out.println("ingrese \"Precio\"Producto 01:");
       Precio01 = sc.nextDouble();
       
       System.out.println("ingrese \"Nombre\"Producto 02:");
       Nombre02 = sc.next();
       
       System.out.println("ingrese \"Cantidad\"Producto 02:");
       Cantidad02 = sc.nextInt();
       
       System.out.println("ingrese \"Precio\"Producto 02:");
       Precio02 = sc.nextDouble();
       
       System.out.println("ingrese \"Nombre\"Producto 03:");
       Nombre03 = sc.next();
       
       System.out.println("ingrese \"Cantidad\"Producto 03:");
       Cantidad03 = sc.nextInt();
       
       System.out.println("ingrese \"Precio\"Producto 03:");
       Precio03 = sc.nextDouble();
       
       double subtotal = 0;
       subtotal += Cantidad01 * Precio01;
       subtotal += Cantidad02 * Precio02;
       subtotal += Cantidad03 * Precio03;
       
       double Impuesto = subtotal * 0.18;
       
       double Total = subtotal + Impuesto;
       
       System.out.println("El Total es: " + Total);
       
    }
    
}
