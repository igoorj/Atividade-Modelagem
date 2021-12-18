package entities;

public class Arquivo {

    private String nome;
    private Integer copias;
    private String cor;

    public Arquivo(String nome, Integer copias, String cor) {
        this.nome = nome;
        this.copias = copias;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
