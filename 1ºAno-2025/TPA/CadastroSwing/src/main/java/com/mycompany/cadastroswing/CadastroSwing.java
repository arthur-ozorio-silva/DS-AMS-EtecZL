/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroswing;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroSwing {
    public static void main(String[] args) {
        // Janela principal
        //Declaração da classe principal chamada CadastroSwing.
        //Todo o código da interface gráfica ficará dentro dessa classe.
        //O método main é o ponto de entrada do programa em Java.
        //Quando você executa o programa, esse método é o primeiro a rodar.
        
        JFrame frame = new JFrame("Cadastro de Pessoas");
        //   Cria a janela principal do programa com o título "Cadastro de Pessoas".
        //JFrame é o componente Swing que representa uma janela.
        frame.setSize(600, 400);//Define o tamanho da janela: 600 pixels de largura e 400 de altura.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Define o que acontece quando o usuário clicar no “X” da janela.
                                                              //EXIT_ON_CLOSE faz o programa encerrar completamente.

        frame.setLayout(null);//Desativa os gerenciadores de layout automáticos.
                              //Permite usar posicionamento absoluto com setBounds
                              //(x, y, largura, altura) para colocar os componentes manualmente.

        // JTextField - Nome
        JLabel nomeLabel = new JLabel("Nome:");//Cria um rótulo de texto (label) com o texto “Nome:”.
                                               //JLabel é usado para mostrar textos fixos na interface.
        nomeLabel.setBounds(20, 20, 50, 25);//Define a posição e o tamanho do rótulo nomeLabel.
                                            //x = 20, y = 20: posição inicial.
                                            //largura = 50, altura = 25: tamanho do rótulo.
        JTextField nomeField = new JTextField();//Cria um campo de texto onde o usuário pode digitar seu nome.
        nomeField.setBounds(80, 20, 200, 25);// Posiciona o campo de texto do nome.
                                             //x = 80 (ao lado do rótulo), y = 20 (mesmo alinhamento vertical)
                                            //largura = 200, altura = 25: tamanho do campo
        frame.add(nomeLabel);
        frame.add(nomeField);//Adiciona o rótulo (nomeLabel) e o campo de texto (nomeField) à janela 
                             //(frame), tornando-os visíveis na interface.

        // JTextArea - Observações
        JLabel obsLabel = new JLabel("Observações:");
        obsLabel.setBounds(20, 60, 100, 25);
        JTextArea obsArea = new JTextArea();
        JScrollPane obsScroll = new JScrollPane(obsArea);
        obsScroll.setBounds(120, 60, 200, 60);
        frame.add(obsLabel);
        frame.add(obsScroll);

        // JCheckBox - Ativo
        JCheckBox ativoBox = new JCheckBox("Ativo");
        ativoBox.setBounds(80, 130, 100, 25);
        frame.add(ativoBox);

        // Botão para adicionar à tabela
        JButton adicionarBtn = new JButton("Adicionar");
        adicionarBtn.setBounds(200, 130, 120, 30);
        frame.add(adicionarBtn);

        // JTable - Tabela de dados
        String[] colunas = { "Nome", "Observações", "Ativo?" };
        DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(20, 180, 540, 150);
        frame.add(tableScroll);

        // Ação do botão
        adicionarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String observacoes = obsArea.getText();
                boolean ativo = ativoBox.isSelected();

                // Adiciona na tabela
                tableModel.addRow(new Object[] { nome, observacoes, ativo ? "Sim" : "Não" });

                // Limpa os campos
                nomeField.setText("");
                obsArea.setText("");
                ativoBox.setSelected(false);
            }
        });

        // Exibe a janela
        frame.setVisible(true);
    }
}