package entities;

import java.time.LocalDate;
import java.util.Date;

public class main {

    public static void main(String[] args) {

        // testando retorno de idade do usuário
        Date dataNascimento = new Date();
        dataNascimento.setMonth(3);
        dataNascimento.setYear(1976);
        dataNascimento.setDate(23);
        Usuario usuario = new Usuario("Arnaldo", "Masculino", dataNascimento);
        System.out.println("Nome: " +usuario.getNome() + "\nIdade:" + usuario.getAnosIdade() + " anos.");

    }
}
