public class MenuLocadoraVeiculos {

    // Objetos das outras classes do sistema
    private AlugarVeiculo alugarVeiculo;
    private CustoAluguelVeiculo custos;
    private ConversorNumeros conversor;
    private EntradaSaidaDados id;
    private CadastrarVeiculo cadastrarVeiculo;

    // Variável de controle do menu
    private int opcao;

     // Construtor: inicializa todos os objetos necessários para o funcionamento do sistema.
    public MenuLocadoraVeiculos() {
        alugarVeiculo = new AlugarVeiculo();
        custos = new CustoAluguelVeiculo();
        conversor = new ConversorNumeros();
        id = new EntradaSaidaDados();
        cadastrarVeiculo = new CadastrarVeiculo();
    }

    /**
      Método principal que executa o sistema da locadora.
      Ele mantém o menu rodando até o usuário escolher sair (opção 0).
     */
    public void executarLocadoraVeiculo(){
        do{
            this.executarMenuPrincipal();// Exibe o menu e lê a opção
            this.avaliarOpcaoEscolhida();// Executa a ação escolhida
        }while(this.opcao!=0);// Continua até o usuário digitar 0
    }


     // Exibe o menu principal e captura a opção do usuário.
    private void executarMenuPrincipal(){
        String mensagemMenu ="Menu"
                +"\n 1- Cadastrar Aluguel"
                +"\n 2- Cadastrar Veiculo"
                +"\n 3- Exibir Dados do Aluguel"
                +"\n 4- Exibir Dados do Veiculo"
                +"\n 5- Calcular Aluguel"
                +"\n 0- Sair";

        // Lê a entrada do usuário (como String)
        String entradaDados = id.entradaDados(mensagemMenu);

        // Converte a entrada para inteiro
        this.opcao = conversor.stringToInt(entradaDados);
    }

    // Avalia a opção escolhida pelo usuário e executa a ação correspondente.
    private void avaliarOpcaoEscolhida(){

        // Verifica se a opção é válida
        if(this.opcao != 0 && this.opcao<=5){

            switch (this.opcao){

                case 1:
                    // Cadastro de aluguel
                    double vDia = conversor.stringToDouble(id.entradaDados("Valor por dia:"));
                    int dias = conversor.stringToInt(id.entradaDados("Número de dias:"));
                    double km = conversor.stringToDouble(id.entradaDados("Km rodados:"));
                    double vKm = conversor.stringToDouble(id.entradaDados("Valor por km:"));

                    alugarVeiculo.cadastrarAluguel(vDia, dias, km, vKm);
                    id.saidaDados("Aluguel cadastrado!");
                    break;

                case 2:
                    // Cadastro de veículo
                    String modelo = id.entradaDados("Modelo do veículo:");
                    int ano = conversor.stringToInt(id.entradaDados("Ano do veículo:"));

                    cadastrarVeiculo.cadastrarVeiculo(modelo, ano);
                    id.saidaDados("Veículo cadastrado!");
                    break;

                case 3:
                    // Exibe dados do aluguel
                    alugarVeiculo.listarAluguel();
                    break;

                case 4:
                    // Exibe dados do veículo
                    id.saidaDados("Modelo: " + cadastrarVeiculo.getModelo() +
                            "\nAno: " + cadastrarVeiculo.getAnofabri());
                    break;

                case 5:
                    // Calcula e exibe o valor total do aluguel
                    custos.calcularAluguel(alugarVeiculo);
                    id.saidaDados(String.valueOf(custos.totalAluguel));
                    break;
            }
        }
    }
}