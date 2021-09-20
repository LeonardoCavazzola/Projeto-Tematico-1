package model;

import javax.persistence.*;

@Entity
public class Raca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    private TipoDeAnimal tipoDeAnimal;

    public Raca() {
    }

    public Raca(String nome, TipoDeAnimal tipoDeAnimal) {
        this.nome = nome;
        this.tipoDeAnimal = tipoDeAnimal;
    }
}
