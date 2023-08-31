package loo.josecomparotto.e03;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Encontro 03
 * 
 * @see loo.josecomparotto.a03.Pessoa
 * 
 * @author José A. Q. C. Gomes
 */
public class Atendente extends Pessoa {

    private int guiche;

    public Atendente(int codigo, String nome, String endereco, String telefone, LocalDate dataNacimento, String rg,
            String cpf, LocalDate dataInsercao, int guiche) {
        super(codigo, nome, endereco, telefone, dataNacimento, rg, cpf, dataInsercao);
        this.guiche = guiche;
    }

    public Atendente() {

    }

    public int getGuiche() {
        return guiche;
    }

    public void setGuiche(int guiche) {
        this.guiche = guiche;
    }

}
