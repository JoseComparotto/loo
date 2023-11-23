package cinema.fakedb;

import cinema.dominio.Sala;

public class SalaFakeDB extends BaseIdentificadorFakeDB<Sala> {

    @Override
    protected String getNomeTabela() {
        return "Salas";
    }

    @Override
    protected void CarregarDados() {
        if(getTabela().size() > 0) return; // Evitando multiplas chamadas 

        getTabela().add(new Sala(
                1,
                70,
                "1500 polegadas",
                "Sala 01"
        ));
        getTabela().add(new Sala(
                2,
                70,
                "1500 polegadas",
                "Sala 02"
        ));
        getTabela().add(new Sala(
                3,
                70,
                "1500 polegadas",
                "Sala 03"
        ));
    }

}
