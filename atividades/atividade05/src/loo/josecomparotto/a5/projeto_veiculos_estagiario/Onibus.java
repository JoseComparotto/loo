package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public class Onibus extends BaseVeiculoTerrestre {

    private int numeroLinha;
    private String nomeLinha;

    public Onibus(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int quantidadeEixos, double pesoLiquido, double pesoBruto, int quantidadeAssentos, int quantidadePortas,
            int quantidadeRodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estado, String cidade, String tipoVeiculo, int quantidadeMotores, int quantidadeOcupantes,
            String chassi, String placa, String codigoRenavam, int numeroLinha, String nomeLinha) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, quantidadeEixos, pesoLiquido, pesoBruto,
                quantidadeAssentos, quantidadePortas, quantidadeRodas, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estado, cidade, tipoVeiculo, quantidadeMotores, quantidadeOcupantes, chassi, placa,
                codigoRenavam);
        this.numeroLinha = numeroLinha;
        this.nomeLinha = nomeLinha;
    }

    public Onibus() {
    }

    public int getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(int numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Linha: (%03d) %s\n", this.numeroLinha, this.nomeLinha);
    }

}
