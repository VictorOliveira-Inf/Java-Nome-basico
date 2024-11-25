/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaula;

import java.util.Scanner;

public class Javaula 
        
{
  
    public static void main(String[] args) 
    {
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Diga seu nome:");
       
       String nome = ler.nextLine();
       
       System.out.println("O nome digitado foi;" + nome);     
    }
    
}
