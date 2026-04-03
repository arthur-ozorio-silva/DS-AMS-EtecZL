/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.calculadorasimples;

/**
 *
 * @author Arthur
 */
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        //Publicando as váriaveis
        float num1 =0;
        float num2 =0;
       
        Scanner scanner = new Scanner(System.in);//Abrindo o scanner
        //Definindo que operação realizar
        System.out.print("Digite qual operação você deseja realizar(soma, subtração, multiplicação ou divisão):");
        String operacao = scanner.nextLine();
        
    //Inserindo um valor para as váriaveis
        System.out.print("Digite um numero:");
        num1 = scanner.nextFloat();
        System.out.print("Digite outro numero:");
        num2 = scanner.nextFloat();
        //Realizando a conta com sistema de if else
        if(operacao.compareTo("soma") == 0)  {
            System.out.print(num1 + num2);
        }else if(operacao.compareTo("subtração") == 0){
            System.out.print(num1 - num2);
        }else if(operacao.compareTo("multiplicação") == 0){
            System.out.print(num1 * num2);
        }else if(num2 !=0){System.out.print(num1 / num2);
        }else {System.out.print("Impossível, divisão por zero");//Divisão por zero resulta em mensagem de erro
        }
        scanner.close();//Fechando o scanner
    }
}
