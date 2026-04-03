/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadescomarrays;

/**
 *
 * @author Arthur Ozório Silva 1ºDS/AMS
 */
import java.util.Arrays;
import java.util.Scanner;
public class AtividadesComArrays {

    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);//Abrindo o scanner

        // Atividades 1 e 2
        
        //Declarando as váriaveis e os Arrays
        int[] numeros = new int[100];
        int[] pares = new int[100];
        int[] impares = new int[100];
        int contadorPares = 0;
        int contadorImpares = 0;
        
        //Solicitando ao usúario que ele insira 100 números inteiros
        System.out.println("DIGITE 100 NÚMEROS INTEIROS");
        for (int i = 0; i < 100; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = UserIn.nextInt();

            //separando os números pares dos ímpares
            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        // Exibindo os números pares
        System.out.println("NÚMEROS PARES");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i]);
        }

        // Exibindo os números ímpares
        System.out.println("NÚMEROS ÍMPARES");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i]);
        }

        // Atividade 3

        //Solicitando ao usúario quantos e quais nomes ele deseja informar
        System.out.print("Quantos nomes deseja digitar? ");
        int qtdNomes = UserIn.nextInt();
        UserIn.nextLine();
        String[] nomes = new String[qtdNomes];
        for (int i = 0; i < qtdNomes; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = UserIn.nextLine();
        }

        // Ordenando em ordem crescente (A-Z)
        Arrays.sort(nomes);

        System.out.println("NOMES EM ORDEM CRESCENTE (A-Z)");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Ordenando em ordem decrescente (Z-A)
        System.out.println("NOMES EM ORDEM DECRESCENTE (Z-A");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        UserIn.close();//Fechando o scanner
    }
}