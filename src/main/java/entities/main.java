package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class main {

    public static void main(String[] args) {

        // testando retorno de idade do usuário
        System.out.println("\nTestando retorno de idade do usuário");
        Date dataNascimento = new Date();
        dataNascimento.setMonth(3);
        dataNascimento.setYear(1976);
        dataNascimento.setDate(23);
        Usuario usuario = new Usuario("Arnaldo", "Masculino", dataNascimento);
        System.out.println("Nome: " + usuario.getNome() + "\nIdade:" + usuario.getAnosIdade() + " anos.");
        System.out.println("-------------------------------");

        // testando cadastro de novo usuarios pela secretaria
        System.out.println("\nTestando cadastro de novo usuarios pela secretaria");
        Departamento dep = new Departamento("Ciencia e Tecnologia");
        Secretario secretario = new Secretario("Arnaldo", "Masculino",
                new Date(), "203445235", "Juiz de Fora", dep, 5, 8);
        Professor professor = new Professor("Beto", "Masculino", new Date(), "3465464", "Governador Valadres", dep);
        secretario.cadastrarUsuario(professor);
        System.out.println("-------------------------------");

        // testando permissao de professores ministrarem uma disciplina X em um semestre Y
        System.out.println("Testando permissao de professores ministrarem uma disciplina X em um semestre Y");
        Departamento dep2 = new Departamento("Ciencia e Tecnologia");
        Semestre semestre = new Semestre("2021.2", new Date(2021, 4, 20), new Date(2021, 12, 6));
        Secretario centralImpressao = new Secretario("Anna", "Feminino", new Date(), "5435565", "JF", dep, 5, 8);
        Curso curso = new Curso(1L, "Ciencia da computacao", semestre, centralImpressao);
        Disciplina disciplina = new Disciplina("Modelagem de sistemas", 60);
        Professor professor2 = new Professor("Beto", "Masculino", new Date(), "3465464", "Governador Valadres", dep2);

        List<Disciplina> disciplinasMinistradas = new ArrayList<>();
        disciplinasMinistradas.add(disciplina);
        professor2.setDisciplinas(disciplinasMinistradas);
        System.out.println("---------------------------------");

        // testando pedido de impressao de aluno
        System.out.println("\nTestando pedido de impressao de aluno");
        List<Arquivo> arquivosPedido = new ArrayList<>();
        Arquivo a1 = new Arquivo("PDF ATIVIDADE 01 - MODELAGEM", 5, "Preto");
        Arquivo a2 = new Arquivo("PDF ATIVIDADE 02 - BANCO DE DADOS", 2, "Colorido");
        Aluno aluno = new Aluno("Arnaldo", "Masculino", new Date(), "23457766", curso);
        Pedido pedido = new Pedido(new Date(), aluno);
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido);
        aluno.setPedidos(pedidos);
        System.out.println(aluno.regristraListaPedidos());
        System.out.println("----------------------------------");

        //testando pedido de impressao de professor
        System.out.println("\nTestando pedido de impressao de professor");
        Disciplina disciplina1 = new Disciplina("OO", 60);
        disciplina1.setCurso(curso);
        List<Arquivo> arquivosPedidoProfessor = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        Arquivo a3 = new Arquivo("PDF ATIVIDADE 01 - MODELAGEM", 5, "Preto");
        Arquivo a4 = new Arquivo("PDF ATIVIDADE 02 - BANCO DE DADOS", 2, "Colorido");
        Professor professor3 = new Professor("Beto", "Masculino", new Date(), "3465464", "Governador Valadres", dep);
        Pedido pedido2 = new Pedido(new Date(), aluno);
        List<Pedido> pedidos2 = new ArrayList<>();
        pedidos2.add(pedido2);
        professor3.setPedidos(pedidos);
        professor3.setDisciplinas(disciplinas);
        System.out.println(professor3.regristraListaPedidos());
        System.out.println("----------------------------------");

        // secretario agora pode passar os pedidos para a lista de registro
        System.out.println("\nSecretario agora pode consultar registros em espera");
        List<Pedido> pedidosSec = centralImpressao.getPedidoList();
        if (!pedidosSec.isEmpty()) {
            for (Pedido p : pedidosSec) {
                System.out.println(p.getAutor());
            }
        } else {
            System.out.println("Não ha registro de novos pedidos!");
        }
        System.out.println("----------------------------------");

        // Secretario pode consultar lista de pedidos e lista em espera
        System.out.println("\nSecretario pode consultar lista de pedidos e lista em espera");
        List<Pedido> registrosSec = centralImpressao.getRegistroList();
        if (!registrosSec.isEmpty()) {
            for (Pedido p2 : registrosSec) {
                System.out.println(p2.getAutor());
            }
        } else {
            System.out.println("Não ha arquivos na fila!");
        }
        System.out.println("----------------------------------");

        // Testando o pagamento de aluno caso exceda numero maximo de copias gratuitas
        System.out.println("\nTestando o pagamento de aluno caso exceda numero maximo de copias gratuitas");
        List<Arquivo> arquivosPedido2 = new ArrayList<>();
        Arquivo arq1 = new Arquivo("PDF ATIVIDADE 01 - MODELAGEM", 60, "Preto");
        arquivosPedido2.add(arq1);
        Aluno aluno4 = new Aluno("Arnaldo","Masculino", new Date(), "23457766", curso);
        Pedido pedido4 = new Pedido(new Date(), aluno);
        pedido4.setArquivosList(arquivosPedido2);
        List<Pedido> pedidos3 = new ArrayList<>();
        pedidos3.add(pedido4);
        aluno4.setPedidos(pedidos3);
        aluno4.regristraListaPedidos();
        System.out.println(aluno4.getPrecoPedidos());
        System.out.println("----------------------------------");


        System.out.println("\nTestando o pagamento de aluno caso exceda numero maximo de copias gratuitas");
        Disciplina disciplina01 = new Disciplina("OO", 60);
        disciplina1.setCurso(curso);
        List<Arquivo> arquivosPedidoProfessor2 = new ArrayList<>();
        List<Disciplina> disciplinas02 = new ArrayList<>();
        disciplinas02.add(disciplina01);
        Arquivo a03 = new Arquivo("PDF ATIVIDADE 01 - MODELAGEM", 250, "Preto");
        arquivosPedidoProfessor2.add(a03);
        Professor professor03 = new Professor("Beto", "Masculino", new Date(), "3465464", "Governador Valadres", dep);
        Pedido pedido02 = new Pedido(new Date(), aluno);
        pedido02.setArquivosList(arquivosPedidoProfessor2);
        List<Pedido> pedidos02 = new ArrayList<>();
        pedidos02.add(pedido02);
        professor03.setPedidos(pedidos02);
        professor03.setDisciplinas(disciplinas);
        System.out.println(professor03.regristraListaPedidos());
        System.out.println(professor03.getPrecoPedidos());
        System.out.println("----------------------------------");


        // Testando o pagamento de aluno caso exceda numero maximo de copias gratuitas( idem para professor)
        System.out.println("\nAluno efetuando pagamento e secretario liberando para fila de impressao");
        List<Arquivo> arquivosPedido3 = new ArrayList<>();
        Arquivo arq2 = new Arquivo("PDF ATIVIDADE 01 - MODELAGEM", 60, "Preto");
        arquivosPedido3.add(arq2);
        Aluno aluno5 = new Aluno("Arnaldo","Masculino", new Date(), "23457766", curso);
        Pedido pedido5 = new Pedido(new Date(), aluno);
        pedido5.setArquivosList(arquivosPedido3);
        List<Pedido> pedidos4 = new ArrayList<>();
        pedidos4.add(pedido5);
        aluno5.setPedidos(pedidos4);
        aluno5.regristraListaPedidos();
        aluno5.efetuarPagamento("Cartão de Credito", aluno5.getPrecoPedidos());
        System.out.println("----------------------------------");
    }
}
