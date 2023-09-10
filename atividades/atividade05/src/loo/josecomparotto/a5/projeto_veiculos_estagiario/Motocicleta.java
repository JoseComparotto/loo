package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public class Motocicleta extends BaseVeiculoTerrestre {

    private int aroRodas;
    private int cilindradas;

    public Motocicleta(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int quantidadeEixos, double pesoLiquido, double pesoBruto, int quantidadeAssentos, int quantidadePortas,
            int quantidadeRodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estado, String cidade, String tipoVeiculo, int quantidadeMotores, int quantidadeOcupantes,
            String chassi, String placa, String codigoRenavam, int aroRodas, int cilindradas) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, quantidadeEixos, pesoLiquido, pesoBruto,
                quantidadeAssentos, quantidadePortas, quantidadeRodas, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estado, cidade, tipoVeiculo, quantidadeMotores, quantidadeOcupantes, chassi, placa,
                codigoRenavam);
        this.aroRodas = aroRodas;
        this.cilindradas = cilindradas;
    }

    public Motocicleta() {
    }

    public int getAroRodas() {
        return aroRodas;
    }

    public void setAroRodas(int aroRodas) {
        this.aroRodas = aroRodas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Aro das rodas: %d\n", this.aroRodas);
        System.out.printf("Cilindradas: %d\n", this.cilindradas);
    }
}
