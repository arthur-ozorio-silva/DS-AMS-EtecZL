/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeentradasaida;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
import javax.swing.*;
public class TesteEntradaSaida {

    public static void main(String[] args) {
       String numero = JOptionPane.showInputDialog("Digite um numero");
       JOptionPane.showMessageDialog(null,"O número digitado foi:"+numero);
    }
}
