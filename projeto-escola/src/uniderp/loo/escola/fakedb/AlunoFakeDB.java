package uniderp.loo.escola.fakedb;

import java.time.LocalDate;

import uniderp.loo.escola.dominio.Aluno;

public class AlunoFakeDB extends FakeDB<Aluno> {

    public AlunoFakeDB() {
        this.carregarDados();
    }

    public void carregarDados() {

        this.insert(new Aluno(
                        0,
                        null,
                        "5645484546",
                        "Endere;o tal",
                        "Mateus",
                        "54564",
                        "2323232345",
                        LocalDate.of(1998, 5, 1),
                        "20220001",
                        null));
        

    }

}
