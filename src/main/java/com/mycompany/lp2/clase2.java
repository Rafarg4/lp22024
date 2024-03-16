/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class clase2 {
    public void main(String[]args){
        //Crear un objeto Scanner para poder ingresar datos
      Scanner scanner = new Scanner(System.in);
      
      //Solicitar al usuario que ingrese dato
      System.out.println("Ingrese su nombre");
      
      String nombre = scanner.nextLine();
        
      System.out.println("Ingrese su apellido");      
      String apellido = scanner.nextLine();
      
      scanner.close();
      System.out.println("Su nombre es:" +nombre+ "Su apellido es:" +apellido);
    }
}
