package entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Secretario extends Funcionario {

    private Integer diasPorSemana;
    private Integer horasPorDia;
    private List<Pedido> pedidoList;
    private List<Usuario> usuarioList;
    private List<Pedido> registroList;

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<Pedido> getRegistroList() {
        return registroList;
    }

    public void setRegistroList(List<Pedido> registroList) {
        this.registroList = registroList;
    }

    public Secretario(String nome, String sexo, Date dataNascimento, String matricula, String unidade, Departamento departamento, Integer diasPorSemana, Integer horasPorDia) {
        super(nome, sexo, dataNascimento, matricula, unidade, departamento);
        this.diasPorSemana = diasPorSemana;
        this.horasPorDia = horasPorDia;
        this.pedidoList = new ArrayList<>();
        this.registroList = new ArrayList<>();
        this.usuarioList = new ArrayList<>();
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

    public void cadastrarUsuario(Usuario novoUsuario) {
        this.usuarioList.add(novoUsuario);
        System.out.println("Usuario cadastrado com sucesso!");
    }

    public void adicionaNovoPedido(Pedido pedido) {
        this.pedidoList.add(pedido);
    }

    public String registrandoPedidos() {
        if(this.pedidoList != null) {
            for(Pedido p: pedidoList) {
                if(p.isPago()) { // só vai para a fila de impressao caso esteja pago
                    if(registroList == null) {
                        p.setStatus("Concluido"); // fila vazia
                    } else {
                        p.setStatus("Na fila");   // já há pedios a serem feitos
                    }
                    this.registroList.add(p);     // adicionando na lista de registros
                    this.pedidoList.remove(p);    // removendo da lista de pedidos
                }
                return "Pedidos da lista registrados com sucesso!";
            }
        }
        return "Não ha pedidos pendentes";
    }
}
