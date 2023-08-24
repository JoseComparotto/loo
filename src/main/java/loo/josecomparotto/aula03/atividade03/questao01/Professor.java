package loo.josecomparotto.aula03.atividade03.questao01;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Atividade 03 - Questão 01
 * 
 * @author José A. Q. C. Gomes
 */
public class Professor extends BasePessoa {

    private String registro;
    private LocalDate dataContratacao;

    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNacimento, String rg,
            String cpf, LocalDate dataInsercao, String registro, LocalDate dataRegistro) {
        super(codigo, nome, endereco, telefone, dataNacimento, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataContratacao = dataRegistro;
    }

    public Professor() {
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataRegistro) {
        this.dataContratacao = dataRegistro;
    }

}
