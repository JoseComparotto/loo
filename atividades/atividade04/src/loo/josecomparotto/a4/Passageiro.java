package loo.josecomparotto.a4;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {
    
    private String numeroCartao;
    private String documento;

    public Passageiro(int codigo, String nome, String email, String telefoe, LocalDate dataNascimento, String usuario,
            String senha, String registro, String numeroCartao, String documento) {
        super(codigo, nome, email, telefoe, dataNascimento, usuario, senha, registro);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}
