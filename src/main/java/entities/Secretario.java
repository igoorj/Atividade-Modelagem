package entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Secretario extends Funcionario {

    private Integer diasPorSemana;
    private Integer horasPorDia;
    private List<Pedido> pedidoList;
    private List<Registro> registroList;

    public Secretario(String nome, String sexo, Date dataNascimento, String matricula, String unidade, Departamento departamento, Integer diasPorSemana, Integer horasPorDia) {
        super(nome, sexo, dataNascimento, matricula, unidade, departamento);
        this.diasPorSemana = diasPorSemana;
        this.horasPorDia = horasPorDia;
        this.pedidoList = new ArrayList<>();
        this.pedidoList = new ArrayList<>();
    }

    public Integer getDiasPorSemana() {
        return diasPorSemana;
    }

    public void setDiasPorSemana(Integer diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public Integer getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(Integer horasPorDia) {
        this.horasPorDia = horasPorDia;
    }
}
