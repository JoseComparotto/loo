package cinema.dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao extends BaseIdentificador {

    private String statusDaSessao;
    private LocalDate data;
    private LocalTime horario;

    private Sala sala;

    public Sessao() {
    }

    public Sessao(int codigo, String statusDaSessao, LocalDate data, LocalTime horario, Sala sala) {
        super(codigo);
        this.statusDaSessao = statusDaSessao;
        this.data = data;
        this.horario = horario;
        this.sala = sala;
    }

    public String getStatusDaSessao() {
        return statusDaSessao;
    }

    public void setStatusDaSessao(String statusDaSessao) {
        this.statusDaSessao = statusDaSessao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Status: %s\tData: %s\tHorário: %s",
                        this.statusDaSessao,
                        this.data.toString(),
                        this.horario.toString());
    }
}
