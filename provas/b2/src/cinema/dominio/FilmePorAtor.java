package cinema.dominio;

public class FilmePorAtor extends BaseIdentificador {
    
    private Filme filme;
    private Ator ator;
    
    public FilmePorAtor() {
    }

    public FilmePorAtor(int codigo, Filme filme, Ator ator) {
        super(codigo);
        this.filme = filme;
        this.ator = ator;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Filme: (%d) %s\tAtor: (%d) %s",
                        this.filme.getCodigo(),
                        this.filme.getTitulo(),
                        this.ator.getCodigo(),
                        this.ator.getNome());
    }

}
