package entities;

import java.util.Date;

public class Atendimento {

    private String diaSemana;
    private Date horarioInicio;
    private Date horarioFinal;

    public Atendimento(String diaSemana, Date horarioInicio, Date horarioFinal) {
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(Date horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
}