public class CadastrarVeiculo {

    // Atributo que guarda o modelo do veículo
    private String modelo;

    // Atributo que guarda o ano de fabricação do veículo
    private int anofabri;


     // Método responsável por cadastrar os dados do veículo.
    public void cadastrarVeiculo(String mod, int anof) {
        modelo = mod;
        anofabri = anof;
    }

    // Retorna o modelo do veículo.
    public String getModelo() {
        return modelo;
    }

     //Retorna o ano de fabricação do veículo.
    public int getAnofabri() {
        return anofabri;
    }
}