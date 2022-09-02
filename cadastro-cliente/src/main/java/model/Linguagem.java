package model;

import javax.persistence.*;

@Entity
public class Linguagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 20, nullable = false)
    private String nome;
    @Column(length = 10, nullable = false)
    private String versao;

    @Override
    public String toString() {
        return "Linguagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}

