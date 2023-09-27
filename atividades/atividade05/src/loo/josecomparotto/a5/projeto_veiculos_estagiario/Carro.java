package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public class Carro extends BaseVeiculoTerrestre {

    private String tipoCarroceria;
    private String tipoTracao;

    public Carro(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int quantidadeEixos,
            double pesoLiquido, double pesoBruto, int quantidadeAssentos, int quantidadePortas, int quantidadeRodas,
            String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, String estado,
            String cidade, String tipoVeiculo, int quantidadeMotores, int quantidadeOcupantes, String chassi,
            String placa,
            String codigoRenavam, String tipoCarroceria, String tipoTracao) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, quantidadeEixos, pesoLiquido, pesoBruto,
                quantidadeAssentos, quantidadePortas, quantidadeRodas, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estado, cidade, tipoVeiculo, quantidadeMotores, quantidadeOcupantes, chassi, placa,
                codigoRenavam);
        this.tipoCarroceria = tipoCarroceria;
        this.tipoTracao = tipoTracao;
    }

    public Carro() {
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Tipo de carroceria: %s\n", this.tipoCarroceria);
        System.out.printf("Tipo de tração: %s\n", this.tipoTracao);
    }
}
