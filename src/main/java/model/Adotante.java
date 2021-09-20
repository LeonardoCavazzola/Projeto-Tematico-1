package model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Adotante extends Pessoa{

    public Adotante() {
    }

    public Adotante(String nome, LocalDate nascimento) {
        super(nome, nascimento);
    }
}
