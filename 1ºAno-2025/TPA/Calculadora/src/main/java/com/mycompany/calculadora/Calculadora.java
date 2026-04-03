/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        // Eu, Arthur Ozório Silva-1º-DSAMS-estou desenvolvendo esta calculadora
      double num1 = 16.5;
      double num2 = 87.8;
      
      double soma = num1 + num2;
      double subtracao = num1 - num2;
         double multiplicacao = num1 * num2;
         double divisao = num2 !=0 ? num1/num2: Double.NaN;
         double resto = num1 % num2;
         
         System.out.println("Resultados das operações:");
         System.out.println("Soma=" + soma);
         System.out.println("Subtração=" + subtracao);
         System.out.println("multiplicação=" + multiplicacao);
         System.out.println("divisão=" + (num2 !=0 ? divisao: "indefinida(divisão por zero)"));
         System.out.println("Resto da divisão=" + resto);
    }
    
}
