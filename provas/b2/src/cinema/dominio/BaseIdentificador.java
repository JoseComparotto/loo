package cinema.dominio;

public abstract class BaseIdentificador {
    protected int codigo;

    public BaseIdentificador() {
    }

    public BaseIdentificador(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.format("Código: %d\t", this.codigo);
    }
    
}
