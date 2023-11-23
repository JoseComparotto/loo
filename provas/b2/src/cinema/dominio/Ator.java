package cinema.dominio;

public class Ator extends BaseIdentificador {

    private String nome;
    private String papelDoAtor;

    public Ator() {
    }

    public Ator(int codigo, String nome, String papelDoAtor) {
        super(codigo);
        this.nome = nome;
        this.papelDoAtor = papelDoAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapelDoAtor() {
        return papelDoAtor;
    }

    public void setPapelDoAtor(String papelDoAtor) {
        this.papelDoAtor = papelDoAtor;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Nome: %s\tPapel: %s",
                        this.nome,
                        this.papelDoAtor);
    }

}
