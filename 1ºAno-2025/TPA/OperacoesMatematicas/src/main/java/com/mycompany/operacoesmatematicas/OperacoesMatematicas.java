/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
         //Estas operações matemáticas foram feitas por Arthur Ozório Silva 1ºDS AMS
         
//Área de um quadrado
        double ladoQuadrado = 5.0;
        double AreaQuadrado = ladoQuadrado * ladoQuadrado;

        //Área de um retângulo
        double Base = 5.0;
        double Altura = 4.0;
        double AreaRetangulo = Base * Altura;

        //Área de um losango
        double DiagonalMaior = 5.0;
        double DiagonalMenor = 4.0;
        double AreaLosango = DiagonalMaior * DiagonalMenor/2;

        //Área de um triângulo
        double BaseT = 4.0;
        double AlturaT = 5.0;
        double AreaTriangulo = BaseT * AlturaT/2;

        //Área de uma circunferência
        double r = 5.0;
        double AreaCirculo = r ** 2 * 3.14;
        
        //Média
        double Var1 = 2.5;
        double Var2 = 6.7; 
        double Var3 = 9.4;
        double Media =(Var1 + Var2 + Var3)/3;
        
        //Numeros usados como exemplo
        double num1 = 16.5;
      double num2 = 87.8;

      //Soma
      double soma = num1 + num2;
      
      //Subtração
      double subtracao = num1 - num2;
    
      //Multiplicação
         double multiplicacao = num1 * num2;
        
         //Divisão
         double divisao = num2 !=0 ? num1/num2: Double.NaN;
         double resto = num1 % num2;
         
         //Mostrar o resultado no console
         System.out.println("Resultados das operações:");
         System.out.println("Área do quadrado:" + AreaQuadrado );
         System.out.println("Área do retângulo:" + AreaRetangulo  );
         System.out.println("Área do losango:" + AreaLosango );
         System.out.println("Área do triângulo:" +AreaTriangulo );
         System.out.println("Área da circunferência:" +AreaCirculo );
          System.out.println("Soma=" + soma);
         System.out.println("Subtração=" + subtracao);
         System.out.println("multiplicação=" + multiplicacao);
         System.out.println("divisão=" + (num2 !=0 ? divisao: "indefinida(divisão por zero)"));
         System.out.println("Resto da divisão=" + resto);
    }
}
