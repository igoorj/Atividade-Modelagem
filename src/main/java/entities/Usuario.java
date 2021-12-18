package entities;
import java.util.Date;

public class Usuario {

    protected String nome;
    protected String sexo;
    protected Date dataNascimento;

    public Usuario(String nome, String sexo, Date dataNascimento) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Integer getAnosIdade() {
        Date date = new Date();
        date.setYear(2021);
        Integer totalAnos = date.getYear() - this.dataNascimento.getYear();
        return totalAnos;
    }
}
