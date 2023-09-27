package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public class Caminhao extends BaseVeiculoTerrestre {

    private String tipoCarga;
    private double capacidadeCarga;

    public Caminhao(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int quantidadeEixos, double pesoLiquido, double pesoBruto, int quantidadeAssentos, int quantidadePortas,
            int quantidadeRodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estado, String cidade, String tipoVeiculo, int quantidadeMotores, int quantidadeOcupantes,
            String chassi, String placa, String codigoRenavam, String tipoCarga, double capacidadeCarga) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, quantidadeEixos, pesoLiquido, pesoBruto,
                quantidadeAssentos, quantidadePortas, quantidadeRodas, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estado, cidade, tipoVeiculo, quantidadeMotores, quantidadeOcupantes, chassi, placa,
                codigoRenavam);
        this.tipoCarga = tipoCarga;
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao() {
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Tipo de carga: %s\n", this.tipoCarga);
        System.out.printf("Capacidade de carga: %.3f kg\n", this.capacidadeCarga);
    }

}
