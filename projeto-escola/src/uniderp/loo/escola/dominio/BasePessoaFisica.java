package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoaFisica extends BasePessoa {

    protected String nome;
    protected String rg;
    protected String cpf;
    protected LocalDate dataNascimento;

    public BasePessoaFisica(int codigo, LocalDate dataInsercao, String telefone, String endereco, String nome,
            String rg, String cpf, LocalDate dataNascimento) {
        super(codigo, dataInsercao, telefone, endereco);
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("RG: %s\n", this.rg);
        System.out.printf("CPF: %s\n", this.cpf);
        System.out.printf("Data de Nascimento: %s\n", this.dataNascimento);

    }

}
