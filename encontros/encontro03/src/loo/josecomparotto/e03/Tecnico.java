package loo.josecomparotto.e03;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Encontro 03
 * 
 * @see loo.josecomparotto.e03.Pessoa
 * 
 * @author José A. Q. C. Gomes
 */
public class Tecnico extends Pessoa {

    private String cracha;

    public Tecnico(int codigo, String nome, String endereco, String telefone, LocalDate dataNacimento, String rg,
            String cpf, LocalDate dataInsercao, String cracha) {
        super(codigo, nome, endereco, telefone, dataNacimento, rg, cpf, dataInsercao);
        this.cracha = cracha;
    }

    public Tecnico() {
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

}
