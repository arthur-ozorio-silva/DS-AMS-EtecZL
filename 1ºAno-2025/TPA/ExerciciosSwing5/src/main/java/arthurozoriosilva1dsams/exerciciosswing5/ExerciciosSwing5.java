/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.exerciciosswing5;

/**
 *
 * @author Arthur
 */
import javax.swing.JOptionPane;
public class ExerciciosSwing5 {

    public static void main(String[] args) {
        double salario=0,salariosMin=0;
        
        salario =Integer.parseInt(JOptionPane.showInputDialog("Digite quanto o seu salário vale: R$"));
        
        salariosMin=(salario/1000.00);
        
        JOptionPane.showMessageDialog(null,"Considerando que um salário mínimo vale R$1000,00 você ganha"
                + " o equivalente  a "+salariosMin+" salários mínimos.");
    }
}
