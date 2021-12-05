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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
