/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este código foi feito por Arthur ozório silva
        byte anosDeVida = 15;
        short idadeFormiga = 2025;
        int populacaoFormiga = 900000;
         long formigaMundial = 13000000000L;//O L é usado por ser um valor longo
         
         float comprimentoFormiga = 2.5f;
         double massaFormiga = 10.5;
         
         char inicialFormiga = 'M';
         boolean positivo = true;
         
         System.out.println("Anos de vida:" + anosDeVida);
         System.out.println("Idade da formiga:" + idadeFormiga);
         System.out.println("população do formigueiro:;" + populacaoFormiga);
         System.out.println("população mundião de formigas:" + formigaMundial);
         System.out.println("Comprimento da formiga:" + comprimentoFormiga + "m");
         System.out.println("Massa da formiga:" + massaFormiga + "ton");
         System.out.println("Inicial do nome da formiga:" + inicialFormiga);
         System.out.println("É positivo?" + positivo);
    }
    
}

