package model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Usuario extends Pessoa {

    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, LocalDate nascimento, String email, String senha) {
        super(nome, nascimento);
        this.email = email;
        this.senha = senha;
    }
}
