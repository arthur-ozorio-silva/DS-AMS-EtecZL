public class CustoAluguelVeiculo {

    double totalAluguel;

    void calcularAluguel(AlugarVeiculo a) {
        totalAluguel = (a.getValorDia() * a.getNumeroDias()) +
                (a.getKilometrosRodados() * a.getValorKilometroRodado());

    }
}