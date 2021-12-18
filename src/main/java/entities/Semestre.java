package entities;

import java.util.Date;

public class Semestre {

    private String nome;
    private Date dataInicio;
    private Date dataFinal;

    public Semestre(String nome, Date dataInicio, Date dataFinal) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
