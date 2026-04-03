/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.exerciciosswing3;

/**
 *
 * @author Arthur
 */
import javax.swing.JOptionPane;
public class ExerciciosSwing3 {

    public static void main(String[] args) {
        double saldo=0,saldoReajustado=0;
        saldo =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do saldo: R$"));
        saldoReajustado=(saldo*1.01);
        JOptionPane.showMessageDialog(null,"O saldo reajustado é: R$"+saldoReajustado+".");
    }
}
