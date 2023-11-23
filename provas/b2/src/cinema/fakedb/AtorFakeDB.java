package cinema.fakedb;

import cinema.dominio.Ator;

public class AtorFakeDB extends BaseIdentificadorFakeDB<Ator> {

    @Override
    protected String getNomeTabela() {
        return "Atores";
    }

    @Override
    protected void CarregarDados() {
        
       getTabela().add(new Ator(1,"Arnold S.","Exterminador" )); 
       getTabela().add(new Ator(2,"Daweyne Jhonson","Fada do Dente"));
       getTabela().add(new Ator(3,"Bruce Lee","Bruce Lee" ));
        
    }
    
}
