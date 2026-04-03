/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.verificadordenumerosprimos;

/**
 *
 * @author Arthur
 */
import java.util.Scanner;
public class VerificadorDeNumerosPrimos {

    public static void main(String[] args) {
        int num = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        if (Primo(num)) {
            System.out.println(num + " É primo!");
        } else {
            System.out.println(num + " Não é primo.");
        }

        scanner.close();
    }

    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
