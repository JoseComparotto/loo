package loo.josecomparotto.aula03.exemplo;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Aula 03
 * 
 * @link https://github.com/JoseComparotto/loo/docs/drawio/loo_aula_03.drawio
 * @author José A. Q. C. Gomes
 */
public class Pessoa {

    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate dataNacimento;
    private String rg;
    private String cpf;
    private LocalDate dataInsercao;

    public Pessoa(int codigo, String nome, String endereco, String telefone, LocalDate dataNacimento, String rg,
            String cpf,
            LocalDate dataInsercao) {
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

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

}
