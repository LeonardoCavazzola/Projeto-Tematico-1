package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDate nascimento;
    private LocalDate dataDeAdocao;
    private Boolean adotado;

    @ManyToMany
    private List<Raca> racas;

    @OneToMany
    private List<Historico> historicos;

    @ManyToOne
    private Adotante adotante;

    public Animal() {
    }

    public Animal(String nome, LocalDate nascimento, LocalDate dataDeAdocao, Boolean adotado, List<Raca> racas, List<Historico> historicos, Adotante adotante) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.dataDeAdocao = dataDeAdocao;
        this.adotado = adotado;
        this.racas = racas;
        this.historicos = historicos;
        this.adotante = adotante;
    }
}
