package loo.josecomparotto.atividades.atividade03.questao02;

public class Produto extends Subclasse {
    protected String marcador;

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public Produto(int id, String nome, String qualificador, String marcador) {
        super(id, nome, qualificador);
        this.marcador = marcador;
    }
}