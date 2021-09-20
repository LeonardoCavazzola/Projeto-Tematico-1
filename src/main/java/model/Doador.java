package model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Doador extends Pessoa{

    public Doador() {
    }

    public Doador(String nome, LocalDate nascimento) {
        super(nome, nascimento);
    }
}
