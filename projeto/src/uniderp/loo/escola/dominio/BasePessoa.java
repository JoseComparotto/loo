package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseDadosComuns {

    protected String telefone;
    protected String endereco;
    
    public BasePessoa(int codigo, LocalDate dataInsercao, String telefone, String endereco) {
        super(codigo, dataInsercao);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
