package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public abstract class BaseVeiculo extends BaseIdentificador {

    protected String nome;
    protected String modelo;
    protected String cor;
    protected int anoModelo;
    protected int anoFabricacao;
    protected int quantidadeEixos;
    protected double pesoLiquido;
    protected double pesoBruto;
    protected int quantidadeAssentos;
    protected int quantidadePortas;
    protected int quantidadeRodas;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected String estado;
    protected String cidade;
    protected String tipoVeiculo;
    protected int quantidadeMotores;
    protected int quantidadeOcupantes;

    public BaseVeiculo(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int quantidadeEixos, double pesoLiquido, double pesoBruto, int quantidadeAssentos, int quantidadePortas,
            int quantidadeRodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estado, String cidade, String tipoVeiculo, int quantidadeMotores, int quantidadeOcupantes) {
        super(codigo);
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.quantidadeEixos = quantidadeEixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoBruto = pesoBruto;
        this.quantidadeAssentos = quantidadeAssentos;
        this.quantidadePortas = quantidadePortas;
        this.quantidadeRodas = quantidadeRodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.estado = estado;
        this.cidade = cidade;
        this.tipoVeiculo = tipoVeiculo;
        this.quantidadeMotores = quantidadeMotores;
        this.quantidadeOcupantes = quantidadeOcupantes;
    }

    public BaseVeiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public void setQuantidadeAssentos(int quantidadeAssentos) {
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        this.quantidadeMotores = quantidadeMotores;
    }

    public int getQuantidadeOcupantes() {
        return quantidadeOcupantes;
    }

    public void setQuantidadeOcupantes(int quantidadeOcupantes) {
        this.quantidadeOcupantes = quantidadeOcupantes;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Tipo de Veiculo: %s\n", this.tipoVeiculo);
        System.out.printf("Fabricante: %s\n", this.fabricante);
        System.out.printf("Modelo: %s\n", this.modelo);
        System.out.printf("Ano do Modelo: %d\n", this.anoModelo);
        System.out.printf("Ano de Fabricação: %d\n", this.anoFabricacao);
        System.out.printf("Cor dominante: %s\n", this.cor);
        System.out.printf("Peso Líquido: %.3f kg\n", this.pesoLiquido);
        System.out.printf("Peso Bruto: %.3f kg\n", this.pesoBruto);
        System.out.printf("Quantidade de Assentos: %s\n", this.quantidadeAssentos);
        System.out.printf("Quantidade de Ocupantes: %d\n", this.quantidadeOcupantes);
        System.out.printf("Quantidade de Portas: %s\n", this.quantidadePortas);
        System.out.printf("Quantidade de Eixos: %s\n", this.quantidadeEixos);
        System.out.printf("Quantidade de Rodas: %s\n", this.quantidadeRodas);
        System.out.printf("Potência: %.3f cavalos\n", this.potencia);
        System.out.printf("Quantidade de Motores: %d\n", this.quantidadeMotores);
        System.out.printf("Tipo de Combustível: %s\n", this.tipoCombustivel);
        System.out.printf("Nome do Proprietario: %s\n", this.nomeProprietario);
        System.out.printf("Estado: %s\n", this.estado);
        System.out.printf("Cidade: %s\n", this.cidade);
    }

}