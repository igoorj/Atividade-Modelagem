package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private Date date;
    private Usuario autor;
    private List<Arquivo> arquivosList;
    private Secretario secretarioImpressao;
    private String status;

    public Pedido(Date date, Usuario autor) {
        this.date = date;
        this.autor = autor;
        this.arquivosList = new ArrayList<>();
        this.secretarioImpressao = new Secretario("Joana", "Feminino", new Date(), "4565787", "Juiz de Fora", new Departamento("Ciencia da Computacao"), 5, 8);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Secretario getSecretarioImpressao() {
        return secretarioImpressao;
    }

    public void setSecretarioImpressao(Secretario secretarioImpressao) {
        this.secretarioImpressao = secretarioImpressao;
    }

    public List<Arquivo> getArquivosList() {
        return arquivosList;
    }

    public void setArquivosList(List<Arquivo> arquivosList) {
        this.arquivosList = arquivosList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
