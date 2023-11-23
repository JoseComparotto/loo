package cinema.dominio;

public class Sala extends BaseIdentificador {
    
    private int numeroAssentos;
    private String tipoTela;
    private String localizacao;
    
    public Sala() {
    }
    
    public Sala(int codigo, int numeroAssentos, String tipoTela, String localizacao) {
        super(codigo);
        this.numeroAssentos = numeroAssentos;
        this.tipoTela = tipoTela;
        this.localizacao = localizacao;
    }


    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Assentos: %d\tTipo de Tela: %s\tLocalização: %s",
                        this.numeroAssentos,
                        this.tipoTela,
                        this.localizacao);
    }
}
