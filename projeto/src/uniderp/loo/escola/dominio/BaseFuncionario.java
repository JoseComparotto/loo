package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseFuncionario extends BasePessoaFisica {

    protected String cracha;
    protected String registro;
    protected String dataVinculoInicio;
    protected String dataVinculoFinal;
    
    public BaseFuncionario(int codigo, LocalDate dataInsercao, String telefone, String endereco, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, String dataVinculoInicio,
            String dataVinculoFinal) {
        super(codigo, dataInsercao, telefone, endereco, nome, rg, cpf, dataNascimento);
        this.cracha = cracha;
        this.registro = registro;
        this.dataVinculoInicio = dataVinculoInicio;
        this.dataVinculoFinal = dataVinculoFinal;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getDataVinculoInicio() {
        return dataVinculoInicio;
    }

    public void setDataVinculoInicio(String dataVinculoInicio) {
        this.dataVinculoInicio = dataVinculoInicio;
    }

    public String getDataVinculoFinal() {
        return dataVinculoFinal;
    }

    public void setDataVinculoFinal(String dataVinculoFinal) {
        this.dataVinculoFinal = dataVinculoFinal;
    }

}
