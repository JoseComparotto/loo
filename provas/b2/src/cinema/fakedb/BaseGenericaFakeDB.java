package cinema.fakedb;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDominio> {
    
    protected ArrayList<TDominio> tabela;

    public ArrayList<TDominio> getTabela() {

        if(this.tabela == null) {
            this.tabela = new ArrayList<TDominio>();
        }

        return this.tabela;
    }

    protected abstract void CarregarDados();

    public BaseGenericaFakeDB(){
        this.tabela = new ArrayList<TDominio>();
        this.CarregarDados();
    }

}
