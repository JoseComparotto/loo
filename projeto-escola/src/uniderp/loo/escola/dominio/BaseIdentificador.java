package uniderp.loo.escola.dominio;

public abstract class BaseIdentificador {
    
    protected int codigo;

    public BaseIdentificador(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
