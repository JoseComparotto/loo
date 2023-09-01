package loo.josecomparotto.a4;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {

    private String contaCorrente;
    private String cracha;

    public Funcionario(int codigo, String nome, String email, String telefoe, LocalDate dataNascimento, String usuario,
            String senha, String registro, String contaCorrente, String cracha) {
        super(codigo, nome, email, telefoe, dataNascimento, usuario, senha, registro);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

}
