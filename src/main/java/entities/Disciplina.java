package entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private List<Atendimento> diasAtendimento;
    private Integer cargaHoraria;
    private List<Professor> titularesPorSemestre;
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina(String nome, Integer cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.diasAtendimento = new ArrayList<>();
        this.titularesPorSemestre = new ArrayList<>();
    }

    public List<Atendimento> getDiasAtendimento() {
        return diasAtendimento;
    }

    public void setDiasAtendimento(List<Atendimento> diasAtendimento) {
        this.diasAtendimento = diasAtendimento;
    }

    public List<Professor> getTitular() {
        return titularesPorSemestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Semestre getSemestreCurso() {
        return this.curso.getSemestre();
    }

}
