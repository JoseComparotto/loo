package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoaFisica {
    private String matricula;
    private LocalDate dataMatricula;

    public Aluno(int codigo, LocalDate dataInsercao, String telefone, String endereco, String nome, String rg,
            String cpf, LocalDate dataNascimento, String matricula, LocalDate dataMatricula) {
        super(codigo, dataInsercao, telefone, endereco, nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
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
