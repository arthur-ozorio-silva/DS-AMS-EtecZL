import javax.swing.JOptionPane;

public class EntradaSaidaDados {

    // Entrada de dados (caixa de diálogo)
    String entradaDados(String mensagemEntrada) {
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    // Saída de dados (mensagem na tela)
    void saidaDados(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}