/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inserindodados;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class InserindoDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Abrindo scanner
        //Inserindo as informações
        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();
         System.out.print("Digite sua data de nascimento:");
        String nascimento = scanner.nextLine();
         System.out.print("Digite seu curso:");
        String curso = scanner.nextLine();
         System.out.print("Digite sua série:");
        String serie = scanner.nextLine();
         System.out.print("Digite sua altura:");
        float altura = scanner.nextFloat();
        System.out.print("Digite seu peso:");
        float peso = scanner.nextFloat();
        //Mostrando as informações
        System.out.println("Olá "+nome+", você nasceu em "+nascimento+" e atualmente esta no "+serie+
                           " de "+curso+". E pesa "+peso+"kg com uma altura de "+altura+"m.");
        scanner.close();//Fechando o scanner
    }
}
