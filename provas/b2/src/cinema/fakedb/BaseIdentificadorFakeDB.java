package cinema.fakedb;

import cinema.dominio.BaseIdentificador;

public abstract class BaseIdentificadorFakeDB<TDominio extends BaseIdentificador>
        extends BaseGenericaFakeDB<TDominio> {

    protected TDominio buscarPorCodigo(int codigo){
        for (TDominio linha : this.getTabela()) {
            if(linha.getCodigo() == codigo)
                return linha;
        }
        return null;
    }

    // Meta-Dado
    protected abstract String getNomeTabela();

    public void Listar() {

        System.out.printf(
                "\n# --------------- Lista de %s --------------- #\n",
                this.getNomeTabela());

        for (TDominio linha : tabela) {
            System.out.println(linha.toString());
        }

        System.out.printf(
                "# ----------- Fim da Lista de %s ------------ #\n\n",
                this.getNomeTabela());
    }

}
