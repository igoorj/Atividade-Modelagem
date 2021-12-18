package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Funcionario {

    private List<Disciplina> disciplinas;
    private static Integer copiasGratuitas = 200;
    private List<Pedido> pedidos;
    private float precoPedidos;
    private boolean pedidosPagos;

    public Professor(String nome, String sexo, Date dataNascimento, String matricula, String unidade, Departamento departamento) {
        super(nome, sexo, dataNascimento, matricula, unidade, departamento);
        this.disciplinas = new ArrayList<Disciplina>();
        this.pedidos = new ArrayList<Pedido>();
        this.precoPedidos = 0;
        this.pedidosPagos = false;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public static Integer getCopiasGratuitas() {
        return copiasGratuitas;
    }

    public static void setCopiasGratuitas(Integer copiasGratuitas) {
        Professor.copiasGratuitas = copiasGratuitas;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public float getPrecoPedidos() {
        return precoPedidos;
    }

    public void setPrecoPedidos(float precoPedidos) {
        this.precoPedidos = precoPedidos;
    }

    public boolean isPedidosPagos() {
        return pedidosPagos;
    }

    public void setPedidosPagos(boolean pedidosPagos) {
        this.pedidosPagos = pedidosPagos;
    }
}
