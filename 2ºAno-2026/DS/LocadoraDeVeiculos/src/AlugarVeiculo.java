public class AlugarVeiculo {

    // Valor cobrado por dia de aluguel
    private double valorDia;

    // Número de dias que o veículo foi alugado
    private int numeroDias;

    // Quantidade de quilômetros rodados
    private double kilometrosRodados;

    // Valor cobrado por quilômetro rodado
    private double valorKilometroRodado;

    // Método responsável por cadastrar os dados do aluguel.
     public void cadastrarAluguel(double vDia, int nDias, double kRodados, double vKilometro) {
        valorDia = vDia;
        numeroDias = nDias;
        kilometrosRodados = kRodados;
        valorKilometroRodado = vKilometro;
    }


     // Exibe os dados do aluguel utilizando a classe EntradaSaidaDados.
    public void listarAluguel() {
        EntradaSaidaDados id = new EntradaSaidaDados();

        id.saidaDados("Valor por dia: " + valorDia
                + "\nNúmero de dias: " + numeroDias
                + "\nKm rodados: " + kilometrosRodados
                + "\nValor por km: " + valorKilometroRodado);
    }

     // Retorna o valor por dia.
    public double getValorDia() {
        return valorDia;
    }


     // Retorna o número de dias.
    public int getNumeroDias() {
        return numeroDias;
    }


     // Retorna os quilômetros rodados.
    public double getKilometrosRodados() {
        return kilometrosRodados;
    }


     // Retorna o valor por quilômetro rodado.
    public double getValorKilometroRodado() {
        return valorKilometroRodado;
    }
}