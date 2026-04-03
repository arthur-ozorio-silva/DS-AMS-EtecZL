package com.mycompany.exerciciosswitchcase;

import java.util.Scanner;

public class ExerciciosSwitchCase {
    public static void main(String[] args) {
        int acertos = 0;

        Scanner userIn = new Scanner(System.in);

        System.out.print("Digite quantas questões você acertou: ");
        acertos = userIn.nextInt();

        switch (acertos) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Você tirou I");
                break;
            case 5:
            case 6:
                System.out.println("Você tirou R");
                break;
            case 7:
            case 8:
                System.out.println("Você tirou B");
                break;
            case 9:
            case 10:
                System.out.println("Você tirou MB");
                break;
            default:
                System.out.println("Resposta invalida");
                break;
        }

        userIn.close();
    }
}

