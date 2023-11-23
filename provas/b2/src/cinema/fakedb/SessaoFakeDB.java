package cinema.fakedb;

import java.time.LocalDate;
import java.time.LocalTime;

import cinema.dominio.Sessao;

public class SessaoFakeDB extends BaseIdentificadorFakeDB<Sessao> {

    private SalaFakeDB salas;

    public SessaoFakeDB(SalaFakeDB salas) {
        this.salas = salas;
        this.CarregarDados();
    }

    @Override
    protected String getNomeTabela() {
        return "Sessaos";
    }

    @Override
    protected void CarregarDados() {

        if(this.salas == null) return; // Evitando exceção 
        if(getTabela().size() > 0) return; // Evitando multiplas chamadas 

        getTabela().add(new Sessao(
                1,
                "Aberta",
                LocalDate.of(2023,11, 22),
                LocalTime.of(15,00, 00),
                this.salas.buscarPorCodigo(1)
        ));
        getTabela().add(new Sessao(
                2,
                "Esgotada",
                LocalDate.of(2023,11, 22),
                LocalTime.of(16,00, 00),
                this.salas.buscarPorCodigo(2)
        ));
        getTabela().add(new Sessao(
                3,
                "Aberta",
                LocalDate.of(2023,11, 22),
                LocalTime.of(21,00, 00),
                this.salas.buscarPorCodigo(3)
        ));
    }

}
