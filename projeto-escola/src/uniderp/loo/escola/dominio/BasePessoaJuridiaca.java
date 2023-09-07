package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoaJuridiaca extends BasePessoa {

    protected String nomeFantasia;
    protected String razaoSocial;
    protected String cnpj;
    protected String ie;
    protected LocalDate dataAbertura;
    
    public BasePessoaJuridiaca(int codigo, LocalDate dataInsercao, String telefone, String endereco,
            String nomeFantasia, String razaoSocial, String cnpj, String ie, LocalDate dataAbertura) {
        super(codigo, dataInsercao, telefone, endereco);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ie = ie;
        this.dataAbertura = dataAbertura;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Nome Fantasia: %s", this.nomeFantasia); 
        System.out.printf("Razao Social: %s", this.razaoSocial); 
        System.out.printf("CNPJ: %s", this.cnpj); 
        System.out.printf("Inscrição Estadual: %s", this.ie); 
        System.out.printf("Data de Abertura: %s", this.dataAbertura); 

    }

}
