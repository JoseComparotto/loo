package loo.josecomparotto.atividades.atividade03.questao02;

public abstract class BaseIdentificador {
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseIdentificador(int id) {
        this.id = id;
    }
}