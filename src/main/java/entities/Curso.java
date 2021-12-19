package entities;

import java.util.List;
import java.util.ArrayList;

public class Curso {

    private Long id;
    private String nome;
    private Semestre semestre;
    private List<Disciplina> disciplinaList;
    private Secretario centralImpressao;

    public Curso(Long id, String nome, Semestre semestre, Secretario secretario) {
        super();
        this.id = id;
        this.nome = nome;
        this.semestre = semestre;
        this.disciplinaList = new ArrayList<Disciplina>();
        this.centralImpressao = secretario;
    }

    public Curso() { }

    public Secretario getCentralImpressao() {
        return centralImpressao;
    }

    public void setCentralImpressao(Secretario centralImpressao) {
        this.centralImpressao = centralImpressao;
    }

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
        for(Disciplina d: disciplinaList) {
            d.setCurso(this);
        }
    }

}
