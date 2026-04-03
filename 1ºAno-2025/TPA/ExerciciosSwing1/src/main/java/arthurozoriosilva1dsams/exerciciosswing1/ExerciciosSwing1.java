/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.exerciciosswing1;

/**
 *
 * @author Arthur
 */
import javax.swing.JOptionPane;

public class ExerciciosSwing1 {

    public static void main(String[] args) {
        
        int ano=0,mes=0,dia=0,DT=0;
        
        ano =Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem:"));
        mes =Integer.parseInt(JOptionPane.showInputDialog("Digite quantos mêses você tem:"));
        dia =Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias você tem:"));
        
        DT=(ano*365)+(mes*30)+(dia);
        
        JOptionPane.showMessageDialog(null,"Você tem: "+DT+" dias no total.");
    }
}
