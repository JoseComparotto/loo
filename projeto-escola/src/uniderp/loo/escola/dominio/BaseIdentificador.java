package uniderp.loo.escola.dominio;

public abstract class BaseIdentificador implements IImpressao {
    
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

    @Override
    public void imprimir() {

        System.out.printf("Código: %d\n", this.codigo);
    }
}
