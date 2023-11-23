package cinema.fakedb;

import cinema.dominio.Ingresso;

public class IngressoFakeDB extends BaseIdentificadorFakeDB<Ingresso> {

    private FilmeFakeDB filmes;
    private SessaoFakeDB sessoes;

    public IngressoFakeDB(FilmeFakeDB filmes, SessaoFakeDB sessoes) {
        this.filmes = filmes;
        this.sessoes = sessoes;
        this.CarregarDados();
    }

    @Override
    protected String getNomeTabela() {
        return "Ingressos";
    }

    @Override
    protected void CarregarDados() {

        if(this.filmes == null || this.sessoes == null) return; // Evitando exceção 
        if(getTabela().size() > 0) return; // Evitando multiplas chamadas 

        getTabela().add(new Ingresso(
                1,
                "Meia",
                "A",
                this.filmes.buscarPorCodigo(1),
                this.sessoes.buscarPorCodigo(1)
        ));
        getTabela().add(new Ingresso(
                1,
                "Meia",
                "B",
                this.filmes.buscarPorCodigo(2),
                this.sessoes.buscarPorCodigo(3)
        ));
        getTabela().add(new Ingresso(
                1,
                "Inteira",
                "A",
                this.filmes.buscarPorCodigo(3),
                this.sessoes.buscarPorCodigo(3)
        ));
    }

}
