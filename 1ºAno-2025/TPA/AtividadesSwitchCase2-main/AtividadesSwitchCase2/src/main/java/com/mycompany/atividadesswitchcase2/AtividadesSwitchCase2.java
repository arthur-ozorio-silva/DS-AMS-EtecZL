/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesswitchcase2;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class AtividadesSwitchCase2 {

    public static void main(String[] args) {
        //Declarando as váriaveis
        int transporte=0,bilhetes=0,banco=0,saque=0,saldo=10000,deposito=0,idade=0,faixetaria = 0;
        //Abrindo scanner
        Scanner UserIn = new Scanner(System.in);
        //Solitando que o usúario Insira um valor para as váriaveis transporte e bilhetes
        System.out.print("Digite um numero de 1 a 4 para escolher um transporte:1 para ônibus urbano,2 para metrô,3 para trem intermunicipal e 4 para ônibus rodoviário: ");
        transporte = UserIn.nextInt();
        System.out.print("Digite quantos bilhetes você quer comprar: ");
        bilhetes = UserIn.nextInt();
        //Informando ao usúario o valor total a ser pago pelos bilhetes
        switch (transporte){
                case 1:
                    System.out.println("Os seus bilhetes para o ônibus urbano irão custar R$"+bilhetes*4.40);
                            break;
                case 2:
                   System.out.println("Os seus bilhetes para o metrô irão custar R$"+(bilhetes*5.00)+",00");
                   break;
                case 3:
                    System.out.println("Os seus bilhetes para o trem intermunicipal irão custar R$"+bilhetes*6.50);
                    break;
                    case 4:
                    System.out.println("Os seus bilhetes para o ônibus rodoviário irão custar R$"+(bilhetes*12.00)+",00");
                    break;
                default:
                    System.out.println("Erro");
        }
        //Início do segundo exercício
        //Solitando que o usúario Insira um valor para a váriavel banco
        System.out.print("Escolha uma opção: 1 para consultar saldo, 2 para sacar dinheiro, 3 para depositar dinheiro e 4 para encerrar atendimento: ");
        banco = UserIn.nextInt();
        //Realizando a ação selecionada pelo usúario
        switch (banco){
                case 1:
                    System.out.println("Você possui R$"+saldo+",00");
                            break;
                case 2:
                   System.out.println("Quanto você deseja sacar? ");
                   saque = UserIn.nextInt();
                   if (saque<=saldo){
                   System.out.println("Saque realizado com sucesso");
                   } else {
                   System.out.println("Saldo insuficiente");
                   }
                   break;
                case 3:
                    System.out.println("Quanto dinheiro deseja guardar? ");
                    deposito = UserIn.nextInt();
                    saldo=saldo+deposito;
                    System.out.println("Depósito realizado com sucesso você agora possui R$"+saldo+",00");
                    break;
                    case 4:
                    System.out.println("Encerrando atendimento");
                    break;
                default:
                    System.out.println("Erro");
        }
        //Início do terceiro exercício
        //Solitando que o usúario Insira um valor para a váriavel idade
        System.out.print("Digite sua idade: ");
        idade = UserIn.nextInt();
        //Identificando a faixa etária do usúario e informando a ele
        if(idade<=12){
            faixetaria = 1;
        } else if (idade<=17){
        faixetaria = 2;
        } else if (idade<=59){
        faixetaria = 3;
        } else if (idade>=60){
        faixetaria = 4;
        }
        switch (faixetaria){
                case 1:
                    System.out.println("Você é criança");
                            break;
                case 2:
                   System.out.println("Você é adolescente");
                   break;
                case 3:
                    System.out.println("Você é adulto");
                    break;
                    case 4:
                   System.out.println(" você é idoso");
                   break;
        }
        //Fechando o scanner
        Scanner close;
    }
}

