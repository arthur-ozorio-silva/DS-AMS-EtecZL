import javax.swing.JOptionPane;

public class MenuLocadoraVeiculos {

    private AlugarVeiculo alugarVeiculo;
    private CustoAluguelVeiculo custos;
    private ConversorNumeros conversor;
    private EntradaSaidaDados id;
    private CadastrarVeiculo cadastrarVeiculo;

    private int opcao;
    private int veiculo;

    public MenuLocadoraVeiculos() {
        alugarVeiculo = new AlugarVeiculo();
        custos = new CustoAluguelVeiculo();
        conversor = new ConversorNumeros();
        id = new EntradaSaidaDados();
        cadastrarVeiculo = new CadastrarVeiculo();
    }

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
        this.opcao = conversor.stringToInt(entradaDados);
    }

    private void avaliarOpcaoEscolhida(){

        if(this.opcao != 0 && this.opcao<=5){

            switch (this.opcao){

                case 1:
                    double vDia = conversor.stringToDouble(id.entradaDados("Valor por dia:"));
                    int dias = conversor.stringToInt(id.entradaDados("Número de dias:"));
                    double km = conversor.stringToDouble(id.entradaDados("Km rodados:"));
                    double vKm = conversor.stringToDouble(id.entradaDados("Valor por km:"));

                    alugarVeiculo.cadastrarAluguel(vDia, dias, km, vKm);
                    id.saidaDados("Aluguel cadastrado!");
                    break;

                case 2:
                    String modelo = id.entradaDados("Modelo do veículo:");
                    int ano = conversor.stringToInt(id.entradaDados("Ano do veículo:"));

                    cadastrarVeiculo.cadastrarVeiculo(modelo, ano);
                    id.saidaDados("Veículo cadastrado!");
                    break;

                case 3:
                    alugarVeiculo.listarAluguel();
                    break;

                case 4:
                    id.saidaDados("Modelo: " + cadastrarVeiculo.getModelo() +
                            "\nAno: " + cadastrarVeiculo.getAnofabri());
                    break;

                case 5:
                    custos.calcularAluguel(alugarVeiculo);
                    break;
            }
        }
    }
}