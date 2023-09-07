package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Tecnico extends BaseFuncionario {
    private String setor;

    public Tecnico(int codigo, LocalDate dataInsercao, String telefone, String endereco, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, String dataVinculoInicio,
            String dataVinculoFinal, String setor) {
        super(codigo, dataInsercao, telefone, endereco, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicio, dataVinculoFinal);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
    }

}
