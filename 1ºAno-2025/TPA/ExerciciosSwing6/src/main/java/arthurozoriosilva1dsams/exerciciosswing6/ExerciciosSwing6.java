/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.exerciciosswing6;

/**
 *
 * @author Arthur
 */
import javax.swing.JOptionPane;
public class ExerciciosSwing6 {

    public static void main(String[] args) {
        int num=0;
        
         num =Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
         
         JOptionPane.showMessageDialog(null,"O antecessor de "+num+" é "+(num-1)+" e seu sucessor é "+(num+1)+".");
    }
}
