package loo.josecomparotto.aula03.atividade03.questao02;

public class Classe extends BaseIdentificador {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe(int id, String nome) {
        super(id);
        this.nome = nome;
    }
}
