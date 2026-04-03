/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesdowhile;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class AtividadesDoWhile {

    public static void main(String[] args) {
        //Declarando váriaveis
        int pares=2,num=0, multiplicador=1,quantNum=100,quantNum2=0,valorI=0,valorF=0,totalImpar=0;
        //Início do primeiro exercício
        //Exibindo todos os números pares entre 1 e 20
        System.out.println("Estes são todos os números pares entre 1 e 20:");
        do{
         System.out.println(pares);
         pares = pares+2;
    }while(pares<=20);
        //Início do segundo exercício
       //Abrindo scanner
        Scanner UserIn = new Scanner(System.in);
        //Solicitando ao usúario que ele imforme que número ele deseja saber a tabuada
         System.out.print("Você deseja saber a tabuada de qual número?: ");
         num = UserIn.nextInt();
         //Exibindo a tabuada
         do{
         System.out.println(num+"X"+multiplicador+"="+num*multiplicador);
         multiplicador = multiplicador+1;
    }while(multiplicador<=10);
         //Início do terceiro exercício
         //Exibindo quantos números existem entre 100 e 125
        System.out.println("Estes são todos os números existentes entre 100 e 125:");
        do{
         quantNum = quantNum+1;
         quantNum2 = quantNum2+1;
    }while(quantNum<=124);
        System.out.println(quantNum2);
        //Início quarto exercício
        //Solicitando ao usúario que ele imforme o valor inicial e o final
         System.out.print("informe um valor inicial e um final para obter a soma dos números ímpares entre eles: ");
         valorI = UserIn.nextInt();
         valorF = UserIn.nextInt();
         //Calculando e mostrardo qual a soma dos numes primos entre o valor inicial e o final
        do{
         valorI = valorI+1;
         if((valorI%2)!= 0){
         totalImpar = totalImpar+valorI;
         }
    }while(valorI<=(valorF-1));
        System.out.print(totalImpar);
    }
}

