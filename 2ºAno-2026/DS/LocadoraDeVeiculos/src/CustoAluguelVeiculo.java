public class CustoAluguelVeiculo {

    double totalAluguel;

    void calcularAluguel(AlugarVeiculo a) {
        totalAluguel = (a.valorDia * a.numeroDias) +
                (a.kilometrosRodados * a.valorKilometroRodado);
    }
}