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

    @ManyToOne
    private Raca raca;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Historico> historicos;

    @ManyToOne
    private Adotante adotante;

    public Animal() {
    }

    public Animal(String nome, LocalDate nascimento, LocalDate dataDeAdocao, Boolean adotado, Raca raca, List<Historico> historicos, Adotante adotante) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.dataDeAdocao = dataDeAdocao;
        this.adotado = adotado;
        this.raca = raca;
        this.historicos = historicos;
        this.adotante = adotante;
    }

    public void addHistorico(Historico historico) {
        this.historicos.add(historico);
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDate getDataDeAdocao() {
        return dataDeAdocao;
    }

    public void setDataDeAdocao(LocalDate dataDeAdocao) {
        this.dataDeAdocao = dataDeAdocao;
    }

    public Boolean getAdotado() {
        return adotado;
    }

    public void setAdotado(Boolean adotado) {
        this.adotado = adotado;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<Historico> historicos) {
        this.historicos = historicos;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }
}
