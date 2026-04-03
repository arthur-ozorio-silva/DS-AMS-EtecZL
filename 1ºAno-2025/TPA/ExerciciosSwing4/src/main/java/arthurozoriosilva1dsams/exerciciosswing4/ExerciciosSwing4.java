/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.exerciciosswing4;

/**
 *
 * @author Arthur
 */
import javax.swing.JOptionPane;
public class ExerciciosSwing4 {

    public static void main(String[] args) {
        double valor1=0,quant1=0,valor2=0,quant2=0,ipi=0,total=0;
        
        valor1 =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor unitário da 1º peça: R$"));
        quant1 =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de peças do primeiro tipo:"));
        valor2 =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor unitário da 2º peça: R$"));
        quant2 =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de peças do segundo tipo:"));
        ipi =Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem do IPI: %"));
        
        total=(valor1*quant1+valor2*quant2)*(ipi/100+1);
        
        JOptionPane.showMessageDialog(null,"O valor to total a ser pago é R$"+total+".");
    }
}
