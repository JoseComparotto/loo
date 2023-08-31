package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseIdentificador {
    
    protected LocalDate dataInsercao;

    public BaseDadosComuns(int codigo, LocalDate dataInsercao) {
        super(codigo);
        this.dataInsercao = dataInsercao;
    }

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

}
