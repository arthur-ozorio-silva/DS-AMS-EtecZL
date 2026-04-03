/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args) {
        //Publicando a variável
        int num = 0;
        
        Scanner scanner = new Scanner(System.in);//Abrindo o scanner
        //inserindo um valor para a variável
        System.out.print("Digite um número:");
        num = scanner.nextInt();
        
        //Calculando e exibindo a tabuada
        System.out.println(num+" x "+1+" = "+(num*1));
        System.out.println(num+" x "+2+" = "+(num*2);
        System.out.println(num+" x "+3+" = "+(num*3);
        System.out.println(num+" x "+4+" = "+(num*4);
        System.out.println(num+" x "+5+" = "+(num*5);
        System.out.println(num+" x "+6+" = "+(num*6);
        System.out.println(num+" x "+7+" = "+(num*7);
        System.out.println(num+" x "+8+" = "+(num*8);
        System.out.println(num+" x "+9+" = "+(num*9);
        System.out.println(num+" x "+10+" = "+(num*10);
        scanner.close();//Fechando o scanner
    }
}
