/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadescommatrizes;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class AtividadesComMatrizes {

    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);

/* ============================================================
                        Atividade1
   ============================================================ */

int[][] matriz1 = new int[4][4];
int somaPares = 0, countPares = 0;

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.print("Digite um número [" + i + "][" + j + "]: ");
        matriz1[i][j] = UserIn.nextInt();
        if (matriz1[i][j] % 2 == 0) {
            somaPares += matriz1[i][j];
            countPares++;
        }
    }
}

System.out.println("Soma dos números pares: " + somaPares);
if (countPares > 0)
    System.out.println("Média dos números pares: " + (double)somaPares / countPares);
else
    System.out.println("Nenhum par encontrado.");

/* ============================================================
                        Atividade2a
   ============================================================ */

char[][] matA = {
    {'a','b','c','d','e'},
    {'f','g','h','i','j'},
    {'k','l','m','n','o'},
    {'p','q','r','s','t'},
    {'u'}
};

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print(matA[i][j] + " ");
    }
    System.out.println();
}

/* ============================================================
                        Atividade2b
   ============================================================ */

int[][] matB = {
    {19, 25, 100, 99},
    {10, 7, 25, 14},
    {35, 2, 47, 74}
};

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.print(matB[i][j] + " ");
    }
    System.out.println();
}

/* ============================================================
                        Atividade2c
   ============================================================ */

double[][] matC = {
    {1.9, 2.5, 10.0},
    {1.0, 7.8, 2.5},
    {3.5, 2.2, 4.7}
};

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(matC[i][j] + " ");
    }
    System.out.println();
}

/* ============================================================
                        Atividade3
   ============================================================ */

int[][] mat5 = new int[5][5];
int somaImpares = 0;
int[] somaCol = new int[5];
int[] somaLin = new int[5];

for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print("Digite [" + i + "][" + j + "]: ");
        mat5[i][j] = UserIn.nextInt();

        if (mat5[i][j] % 2 != 0)
            somaImpares += mat5[i][j];

        somaCol[j] += mat5[i][j];
        somaLin[i] += mat5[i][j];
    }
}

System.out.println("Soma dos ímpares: " + somaImpares);

System.out.print("Soma das colunas: ");
for (int x : somaCol) System.out.print(x + " ");
System.out.println();

System.out.print("Soma das linhas: ");
for (int x : somaLin) System.out.print(x + " ");
System.out.println();

/* ============================================================
                        Atividade4
   ============================================================ */

int[][] mat3x5 = new int[3][5];
int pares = 0, impares = 0;
boolean repetido = false;

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print("Digite [" + i + "][" + j + "]: ");
        mat3x5[i][j] = UserIn.nextInt();
        if (mat3x5[i][j] % 2 == 0) pares++;
        else impares++;
    }
}

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 5; j++) {
        for (int k = i; k < 3; k++) {
            for (int l = (k == i ? j + 1 : 0); l < 5; l++) {
                if (mat3x5[i][j] == mat3x5[k][l]) repetido = true;
            }
        }
    }
}
if (repetido==true){
System.out.println("Possui elementos repetidos");
}else System.out.println("Não possui elementos repetidos");
System.out.println("Possui "+pares+" pares");
System.out.println("Ímpares "+impares+"ímpares");

/* ============================================================
                        Atividade5
   ============================================================ */

double[][] mat4 = new double[4][4];
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.print("Digite [" + i + "][" + j + "]: ");
        mat4[i][j] = UserIn.nextDouble();
    }
}

System.out.println("Diagonal principal:");
for (int i = 0; i < 4; i++) System.out.print(mat4[i][i] + " ");
System.out.println();

System.out.println("Diagonal secundária:");
for (int i = 0; i < 4; i++) System.out.print(mat4[i][3 - i] + " ");
System.out.println();

/* ============================================================
                        Atividade6a
   ============================================================ */

int[][] figA = {
    {1,1,1,1,1},
    {1,1,1,1,1},
    {1,1,1,1,1},
    {1,1,1,1,1},
    {1,1,1,1,1}
};

for (int[] linha : figA) {
    for (int v : linha) System.out.print((v == 1 ? "* " : "  "));
    System.out.println();
}

/* ============================================================
                        Atividade6b
   ============================================================ */

int[][] figB = {
    {1,1,1,1,1},
    {1,0,0,0,1},
    {1,0,0,0,1},
    {1,0,0,0,1},
    {1,1,1,1,1}
};

for (int[] linha : figB) {
    for (int v : linha) System.out.print((v == 1 ? "* " : "  "));
    System.out.println();
}

/* ============================================================
                        Atividade6c
   ============================================================ */

int[][] figC = {
    {1,0,0,0,0},
    {1,1,0,0,0},
    {1,1,1,0,0},
    {1,1,1,1,0},
    {1,1,1,1,1}
};

for (int[] linha : figC) {
    for (int v : linha) System.out.print((v == 1 ? "* " : "  "));
    System.out.println();
}
    }
}