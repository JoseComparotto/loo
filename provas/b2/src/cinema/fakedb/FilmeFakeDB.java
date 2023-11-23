package cinema.fakedb;

import cinema.dominio.Filme;

public class FilmeFakeDB extends BaseIdentificadorFakeDB<Filme> {

    @Override
    protected String getNomeTabela() {
        return "Filmes";
    }

    @Override
    protected void CarregarDados() {
        
       getTabela().add(new Filme(1,"O Exterminador do Futuro",130,"Ação, Ficção Científica")); 
       getTabela().add(new Filme(2, "O Fada do Dente", 120,"Comédia, Fantasia"));
       getTabela().add(new Filme(3, "Filme do Bruce Lee ;-;",180,"Ação"));
        
    }
    
}
