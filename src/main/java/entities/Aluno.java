package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Usuario{

    private String matricula;
    private Curso curso;
    private static Integer copiasGratuitas = 50;
    private int copiasDisponiveis;
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
        this.copiasDisponiveis = 50;
    }

    public Aluno() { }

    public static void setCopiasGratuitas(Integer copiasGratuitas) {
        Aluno.copiasGratuitas = copiasGratuitas;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

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

    public String regristraListaPedidos() {
        int counter = 0;
        Secretario secImpressao =  this.curso.getCentralImpressao();
        if(this.pedidos != null) {
            for(Pedido p: this.pedidos) {
                p.setStatus("Solicitado");
                secImpressao.adicionaNovoPedido(p);

                for(Arquivo arq : p.getArquivosList()) {
                    counter += arq.getCopias();
                    this.copiasDisponiveis -= counter;
                    if(copiasDisponiveis < 0) {
                        this.precoPedidos = 0.25F * Math.abs(copiasDisponiveis);
                    }
                }
            }

            return "Pedido realizado com sucesso pelo Aluno!";
        }
        return "Erro ao fazer um pedido";
    }

    public void efetuarPagamento(String formaPagamento, float total) {
        for (Pedido p : this.pedidos) {
            p.setPago(true);
        }
        System.out.println("Pagamento realizado com sucesso!");
    }
}
