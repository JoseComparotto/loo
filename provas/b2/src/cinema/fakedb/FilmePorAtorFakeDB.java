package cinema.fakedb;

import cinema.dominio.FilmePorAtor;

public class FilmePorAtorFakeDB extends BaseIdentificadorFakeDB<FilmePorAtor> {

    private FilmeFakeDB filmes;
    private AtorFakeDB atores;

    public FilmePorAtorFakeDB(FilmeFakeDB filmes, AtorFakeDB atores) {
        this.filmes = filmes;
        this.atores = atores;
        this.CarregarDados();
    }

    @Override
    protected String getNomeTabela() {
        return "Filmes por Atores";
    }

    @Override
    protected void CarregarDados() {

        if(this.filmes == null || this.atores == null) return; // Evitando exceção 
        if(getTabela().size() > 0) return; // Evitando multiplas chamadas 

        getTabela().add(new FilmePorAtor(
                1,
                this.filmes.buscarPorCodigo(1),
                this.atores.buscarPorCodigo(1)
        ));
        
        getTabela().add(new FilmePorAtor(
                2,
                this.filmes.buscarPorCodigo(2),
                this.atores.buscarPorCodigo(2)
        ));

        getTabela().add(new FilmePorAtor(
                3,
                this.filmes.buscarPorCodigo(3),
                this.atores.buscarPorCodigo(3)
        ));
    }

}
