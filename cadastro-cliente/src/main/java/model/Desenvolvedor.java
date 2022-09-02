package model;

import javax.persistence.*;

@Entity
public class Desenvolvedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 13, nullable = false, unique = true)
    private String documento;
    @Column(length = 20, nullable = false)
    private String genero;
    @Column(length = 20, nullable = false)
    private String anonascimento;

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", genero='" + genero + '\'' +
                ", anonascimento='" + anonascimento + '\'' +
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnonascimento() {
        return anonascimento;
    }

    public void setAnonascimento(String anonascimento) {
        this.anonascimento = anonascimento;
    }
}
