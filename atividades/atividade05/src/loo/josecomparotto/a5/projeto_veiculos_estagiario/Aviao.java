package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public class Aviao extends BaseVeiculoAereo {

    protected String companhiaAerea;

    public Aviao(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int quantidadeEixos, double pesoLiquido, double pesoBruto, int quantidadeAssentos, int quantidadePortas,
            int quantidadeRodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estado, String cidade, String tipoVeiculo, int quantidadeMotores, int quantidadeOcupantes,
            String matricula, String companhiaAerea) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, quantidadeEixos, pesoLiquido, pesoBruto,
                quantidadeAssentos, quantidadePortas, quantidadeRodas, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estado, cidade, tipoVeiculo, quantidadeMotores, quantidadeOcupantes, matricula);
        this.companhiaAerea = companhiaAerea;
    }

    public Aviao() {
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Companhia aérea: %s\n", this.companhiaAerea);
    }
}
