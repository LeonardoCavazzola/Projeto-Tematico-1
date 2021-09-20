package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consumivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer saldoDeEstoque;

    public Consumivel() {
    }

    public Consumivel(String nome, Integer saldoDeEstoque) {
        this.nome = nome;
        this.saldoDeEstoque = saldoDeEstoque;
    }
}
