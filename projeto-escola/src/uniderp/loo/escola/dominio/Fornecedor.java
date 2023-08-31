package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Fornecedor extends BasePessoaJuridiaca {
    private String servico;
    private LocalDate dataContrato;
    private int periodoEmMeses;

    public Fornecedor(int codigo, LocalDate dataInsercao, String telefone, String endereco, String nomeFantasia,
            String razaoSocial, String cnpj, String ie, LocalDate dataAbertura, String servico, LocalDate dataContrato,
            int periodoEmMeses) {
        super(codigo, dataInsercao, telefone, endereco, nomeFantasia, razaoSocial, cnpj, ie, dataAbertura);
        this.servico = servico;
        this.dataContrato = dataContrato;
        this.periodoEmMeses = periodoEmMeses;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public int getPeriodoEmMeses() {
        return periodoEmMeses;
    }

    public void setPeriodoEmMeses(int periodoEmMeses) {
        this.periodoEmMeses = periodoEmMeses;
    }

}
