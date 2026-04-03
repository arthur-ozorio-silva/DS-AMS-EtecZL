/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arthurozoriosilva1dsams.exerciciosswing2;

/**
 *
 * @author Arthur
 */
import javax.swing.JOptionPane;
public class ExerciciosSwing2 {

    public static void main(String[] args) {
        float media1=(8+9+7)/3,media2=(4+5+6)/3,somaMedia=media1+media2,mediaGeral=somaMedia/2;
        
        JOptionPane.showMessageDialog(null,"A média de 8,9 e 7 é: "+media1);
        JOptionPane.showMessageDialog(null,"A média de 4,5 e 6 é: "+media2);
        JOptionPane.showMessageDialog(null,"A soma de "+media1+" e "+media2+" é: "+somaMedia);
        JOptionPane.showMessageDialog(null,"A média de "+media1+" e "+media2+" é: "+mediaGeral);
    }
}
