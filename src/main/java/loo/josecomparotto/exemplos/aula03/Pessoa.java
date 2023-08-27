package loo.josecomparotto.exemplos.aula03;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Aula 03
 * 
 * @author José A. Q. C. Gomes
 */
public abstract class Pessoa {

    protected int codigo;
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected LocalDate dataNacimento;
    protected String rg;
    protected String cpf;
    protected LocalDate dataInsercao;

    public Pessoa(int codigo, String nome, String endereco, String telefone, LocalDate dataNacimento, String rg,
            String cpf, LocalDate dataInsercao) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNacimento = dataNacimento;
        this.rg = rg;
        this.cpf = cpf;
        this.dataInsercao = dataInsercao;
    }

    public Pessoa() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    @Override
    public String toString() {
        return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone
                + ", dataNacimento=" + dataNacimento + ", rg=" + rg + ", cpf=" + cpf + ", dataInsercao=" + dataInsercao
                + "]";
    }

}
