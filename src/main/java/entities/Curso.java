package entities;

import java.util.List;
import java.util.ArrayList;

public class Curso {

    private Long id;
    private String nome;
    private Semestre semestre;
    private List<Disciplina> disciplinaList;

    public Curso(Long id, String nome, Semestre semestre) {
        super();
        this.id = id;
        this.nome = nome;
        this.semestre = semestre;
        this.disciplinaList = new ArrayList<Disciplina>();
    }

    public Curso() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void setDisciplinaList(List<Disciplina> disciplinaList) {
        this.disciplinaList = disciplinaList;
    }
}
