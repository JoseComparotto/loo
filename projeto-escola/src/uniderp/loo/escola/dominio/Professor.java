package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BaseFuncionario {
    private String cadeira;

    public Professor(int codigo, LocalDate dataInsercao, String telefone, String endereco, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, String dataVinculoInicio,
            String dataVinculoFinal, String cadeira) {
        super(codigo, dataInsercao, telefone, endereco, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicio, dataVinculoFinal);
        this.cadeira = cadeira;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

}
