/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesswitchcase;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class AtividadesSwitchCase {

    public static void main(String[] args) {
        //Declarando as váriaveis
        int fruta=0,jogo=0,dia=0;
        //Abrindo scanner
        Scanner UserIn = new Scanner(System.in);
        //Solitando que o usúario Insira um valor para a váriavel fruta
        System.out.print("Digite um numero de 1 a 3: ");
        fruta = UserIn.nextInt();
        //Informando ao usúario a fruta equivalente ao número escolhido
        switch (fruta){
                case 1:
                    System.out.println("Maça");
                            break;
                case 2:
                   System.out.println("Banana");
                   break;
                case 3:
                    System.out.println("Laranja");
                    break;
                default:
                    System.out.println("Fruta inválida");
        }
        //Início do segundo exercício
        //Solitando que o usúario Insira um valor para a váriavel jogo
        System.out.print("Digite um numero de 1 a 5: ");
        jogo = UserIn.nextInt();
        //Informando ao usúario o jogo equivalente ao número escolhido
        switch (jogo){
                case 1:
                    System.out.println("Minecraft");
                            break;
                case 2:
                   System.out.println("Fifa");
                   break;
                case 3:
                    System.out.println("Fortnite");
                    break;
                    case 4:
                   System.out.println("Call of Duty");
                   break;
                   case 5:
                   System.out.println("The Sims");
                   break;
                default:
                    System.out.println("Jogo não encontrado");
        }
        //Início do terceiro exercício
        //Solitando que o usúario Insira um valor para a váriavel dia
        System.out.print("Digite um numero de 1 a 7: ");
        dia = UserIn.nextInt();
        //Informando ao usúario o dia da semana equivalente ao número escolhido
        switch (dia){
                case 1:
                    System.out.println("Domingo");
                            break;
                case 2:
                   System.out.println("Segunda-feira");
                   break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                    case 4:
                   System.out.println("Quarta-feira");
                   break;
                   case 5:
                   System.out.println("Quinta-feira");
                   break;
                   case 6:
                    System.out.println("Sexta-feira");
                    break;
                    case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Dia inválido");
        }
        //Fechando o scanner
        Scanner close;
    }
}

