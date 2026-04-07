public class CustoAluguelVeiculo {

    // Atributo que armazena o valor total do aluguel
    double totalAluguel;

    /**
      Método que calcula o valor total do aluguel com base nos dados
      fornecidos pela classe AlugarVeiculo.
     */
    void calcularAluguel(AlugarVeiculo a) {
        totalAluguel = (a.getValorDia() * a.getNumeroDias()) +
                (a.getKilometrosRodados() * a.getValorKilometroRodado());
    }
}