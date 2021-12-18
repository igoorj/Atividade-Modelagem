package entities;

import java.util.Date;

public class Funcionario extends Usuario{

    private String matricula;
    private String unidade;
    private Departamento departamento;

    public Funcionario (String nome, String sexo, Date dataNascimento, String matricula, String unidade, Departamento departamento) {
        super(nome, sexo, dataNascimento);
        this.matricula = matricula;
        this.unidade = unidade;
        this.departamento = departamento;
    }
    public Funcionario() { }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
