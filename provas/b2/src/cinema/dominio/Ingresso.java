package cinema.dominio;

public class Ingresso extends BaseIdentificador {

    private String tipo;
    private String categoria;

    private Filme filme;
    private Sessao sessao;

    public Ingresso() {
    }

    public Ingresso(int codigo, String tipo, String categoria, Filme filme, Sessao sessao) {
        super(codigo);
        this.tipo = tipo;
        this.categoria = categoria;
        this.filme = filme;
        this.sessao = sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Filme: %s\tSessao: [%s]\tTipo: %s\tCategoria: %s",
                        this.filme.getTitulo(),
                        this.sessao.toString(),
                        this.tipo,
                        this.categoria);
    }

}
