package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "aluno")
@Table(name = "aluno")
public class Aluno {


    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String senha;
    //mappedby="aluno"
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    @JoinTable(name = "AlunoNota", joinColumns = @JoinColumn(name = "alunoid"), inverseJoinColumns = @JoinColumn(name = "notaid"))
    @Column
    private List<Nota> notas = new ArrayList<>();
    @Column
    private String nome;
    @Column
    private  String prontuario;
    @Column
    private double media;


    public Aluno(String senha, List<Nota> notas, String nome, String prontuario, double media) {
        this.senha = senha;
        this.notas = notas;
        this.nome = nome;
        this.prontuario = prontuario;
        this.media = media;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", senha='" + senha + '\'' +
                ", notas=" + notas +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", media=" + media +
                '}';
    }
}


