package cinema.dominio;

public class Filme extends BaseIdentificador {
    
    private String titulo;
    private int duracao;
    private String genero;
    
    public Filme() {
    }
    
    public Filme(int codigo, String titulo, int duracao, String genero) {
        super(codigo);
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Título: %s\tDuração: %d min\tGenero: %s\t",
                        this.titulo,
                        this.duracao,
                        this.genero
                        );
    }

}
