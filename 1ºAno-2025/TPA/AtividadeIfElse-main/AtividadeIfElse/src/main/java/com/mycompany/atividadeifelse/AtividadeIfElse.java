/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeifelse;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class AtividadeIfElse {

    public static void main(String[] args) {
    //Aqui estão sendo publicadas as variaveis
        double altura=0,idade=0,nota=0;
        //Aqui está sendo pedido que o usúario infore sua altura
        altura =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de sua altura em centimetros: "));
        //Estrutura if else que compara se a altura do usúario está na média e informa ao usúario
        if (altura == 167){
            JOptionPane.showMessageDialog(null,"Sua altura está exatamente na média brasileira.");
        }else if (altura<167){
        JOptionPane.showMessageDialog(null,"Sua altura está abaixo da média brasileira.");
        }else if (altura>167) {
            JOptionPane.showMessageDialog(null,"Sua altura está acima da média brasileira.");
        }
        //Aqui está sendo pedido que o usúario infore sua idade
        idade=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de sua idade em anos: "));
        //Aqui um if informa se o usúario não está na média de idade para alguelm do 1ºAno,apenas se esse for o caso
        if (idade !=16){
            JOptionPane.showMessageDialog(null,"Sua idade está fora da média de idade do 1ºAno.");
        }
        //Aqui está sendo pedido que o usúario a nota de sua ultima prova.
        nota =Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota na ultima prova de 0 a10 que você fez: "));
        //aqui temos um sistema if else que verifica e informa se o usúario passou ou não.
        if(nota<=5){
            JOptionPane.showMessageDialog(null,"Você não passou");
        }else if(nota>=6){
            JOptionPane.showMessageDialog(null,"Você passou");
        }
}
}
