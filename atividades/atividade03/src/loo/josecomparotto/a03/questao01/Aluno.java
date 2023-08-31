package loo.josecomparotto.a03.questao01;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Atividade 03 - Questão 01
 * 
 * @author José A. Q. C. Gomes
 */
public class Aluno extends BasePessoa {

    private String matricula;
    private LocalDate dataMatricula;

    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNacimento, String rg,
            String cpf, LocalDate dataInsercao, String matricula, LocalDate dataMatricula) {
        super(codigo, nome, endereco, telefone, dataNacimento, rg, cpf, dataInsercao);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    public Aluno() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}
