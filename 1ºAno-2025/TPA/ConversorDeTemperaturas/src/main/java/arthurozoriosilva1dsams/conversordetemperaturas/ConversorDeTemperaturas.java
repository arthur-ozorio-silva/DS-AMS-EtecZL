/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.conversordetemperaturas;

/**
 *
 * @author Arthur
 */
import java.util.Scanner;
public class ConversorDeTemperaturas {

    public static void main(String[] args) {
        float C = 0;//Publicando a Variavel com o valor em celsius
        
        
        Scanner scanner = new Scanner(System.in);//Abrindo o scanner
        //Inserindo um valor para a váriavel C
        System.out.print("Digite a tempratura em Celsius:");
        C = scanner.nextFloat();
        //Exibindo a temperatura em fahrenheit e kelvin
        System.out.println("fahrenheit=" + (C*1.8+32));
        System.out.println("Kelvin=" + (C+273.15));
        
        scanner.close();//Fechando o scanner
    }
}
