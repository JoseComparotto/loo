package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public abstract class BaseVeiculoTerrestre extends BaseVeiculo {

    protected String chassi;
    protected String placa;
    protected String codigoRenavam;

    public BaseVeiculoTerrestre(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int quantidadeEixos, double pesoLiquido, double pesoBruto, int quantidadeAssentos, int quantidadePortas,
            int quantidadeRodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estado, String cidade, String tipoVeiculo, int quantidadeMotores, int quantidadeOcupantes,
            String chassi, String placa, String codigoRenavam) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, quantidadeEixos, pesoLiquido, pesoBruto,
                quantidadeAssentos, quantidadePortas, quantidadeRodas, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estado, cidade, tipoVeiculo, quantidadeMotores, quantidadeOcupantes);
        this.chassi = chassi;
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
    }

    public BaseVeiculoTerrestre() {
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Nº do Chassi: %s\n", this.chassi);
        System.out.printf("Placa: %s\n", this.placa);
        System.out.printf("Código Renavam: %s\n", this.codigoRenavam);
    }

}
