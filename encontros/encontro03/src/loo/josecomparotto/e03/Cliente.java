package loo.josecomparotto.e03;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Encontro 03
 * 
 * @see loo.josecomparotto.a03.Pessoa
 * 
 * @author José A. Q. C. Gomes
 */
public class Cliente extends Pessoa {

    private double credito;

    public Cliente(int codigo, String nome, String endereco, String telefone, LocalDate dataNacimento, String rg,
            String cpf, LocalDate dataInsercao, double credito) {
        super(codigo, nome, endereco, telefone, dataNacimento, rg, cpf, dataInsercao);
        this.credito = credito;
    }

    public Cliente() {
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }    

}
