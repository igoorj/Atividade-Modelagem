package entities;

import java.util.List;
import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private List<Atendimento> diasAtendimento;
    private Integer cargaHoraria;

    public Disciplina(String nome, Integer cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.diasAtendimento = new ArrayList<>();
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
}
