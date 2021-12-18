package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Usuario{

    private String matricula;
    private Curso curso;
    private static Integer copiasGratuitas = 50;
    private List<Pedido> pedidos;
    private Semestre semestre;
    private float precoPedidos;
    private boolean pedidosPagos;

    public Aluno(String nome, String sexo, Date dataNascimento, String matricula, Curso curso) {
        super(nome, sexo, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.pedidosPagos = false;
        this.precoPedidos = 0;
        this.pedidos = new ArrayList<Pedido>();
    }

    public Aluno() { }

    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public static Integer getCopiasGratuitas() {
        return copiasGratuitas;
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
