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

    public Integer saida(Integer quant) {
        return this.saldoDeEstoque -= quant;
    }

    public Integer entrada(Integer quant) {
        return this.saldoDeEstoque += quant;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSaldoDeEstoque() {
        return saldoDeEstoque;
    }

    public void setSaldoDeEstoque(Integer saldoDeEstoque) {
        this.saldoDeEstoque = saldoDeEstoque;
    }
}
