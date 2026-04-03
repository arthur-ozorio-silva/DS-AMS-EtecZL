import javax.swing.JOptionPane;
public class MenuLocadoraVeiculos {

   private AlugarVeiculo alugarVeiculo;
   private CustoAluguelVeiculo custos;
   private ConversorNumeros conversor;
   private EntradaSaidaDados id;
   private int opcao;
   private int veiculo;

    public void executarLocadoraVeiculo(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=0);
    }
    private void executarMenuPrincipal(){
        String mensagemMenu ="Menu"
            +"\n 1- Cadastrar Aluguel"
            +"\n 2- Cadastrar Veiculo"
            +"\n 3- Exibir Dados do Aluguel"
            +"\n 4- Exibir Dados do Veiculo"
            +"\n 5- Calcular Aluguel"
            +"\n 0- Sair";

        String entradaDados = id.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToInt(entradaDados);
    }
    private void avaliarOpcaoEscolhida(){
     String saida;

    if(this.opcao != 0 && this.opcao<=5){
switch (this.opcao){
    case 1:
        alugarVeiculo.CadastrarAluguel();
        id.saidaDados("Saída");
        break;
    case 2:
        CadastrarVeiculo.cadastrarVeiculo
        id.saidaDados("Saída");
        break;
    case 3:
        alugarVeiculo.ListarAluguel();
        id.saidaDados("Saída");
        break;
    case 4:
        id.saidaDados("Saída");
        break;
    case 5:
        id.saidaDados("Saída");
        break;}
    }
    }
}