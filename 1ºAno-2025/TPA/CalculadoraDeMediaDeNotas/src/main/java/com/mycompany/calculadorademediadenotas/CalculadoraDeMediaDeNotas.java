/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorademediadenotas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class CalculadoraDeMediaDeNotas {

    public static void main(String[] args) {
        //publicando as variáveis
        float n1 =0;
        float n2 =0;
        float n3 =0;
        float n4 =0;
        Scanner scanner =new Scanner(System.in);//Abrindo o scanner
        //Inserindo um valor paa as variáveis
        System.out.print("Digite sua primeira nota:");
        n1 = scanner.nextFloat();
        System.out.print("Digite sua segunda nota:");
        n2 = scanner.nextFloat();
        System.out.print("Digite sua terceira nota:");
        n3 = scanner.nextFloat();
        System.out.print("Digite sua quarta nota:");
        n4 = scanner.nextFloat();
        
        Float media = (n1+n2+n3+n4)/4;//Calculando a média
        //Mostrando a média e se você passou ou não
        if(media>=7){System.out.println("Sua média é "+media+", parabéns você passou!");
        }else System.out.println("Sua média é "+media+", você não passou!");
        scanner.close();//Fechando o scanner
    }
}
