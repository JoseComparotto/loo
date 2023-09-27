package loo.josecomparotto.a5.projeto_veiculos_estagiario;

public abstract class BaseIdentificador implements IImpresao {

    protected int codigo;

    public BaseIdentificador(int codigo) {
        this.codigo = codigo;
    }

    public BaseIdentificador() {
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
