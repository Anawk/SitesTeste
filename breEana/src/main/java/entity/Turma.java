package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "turma")
@Table(name = "turma")

public class Turma {


    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professorid")
    @Column
    private Professor professor;
    @Column
    private Integer horario;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "turma")
    @JoinTable(name = "TurmaAluno", joinColumns = @JoinColumn(name = "turmaid"), inverseJoinColumns = @JoinColumn (name = "alunoid"))
    @Column
    private List<Aluno> alunos = new ArrayList<>();
    @Column
    private  String codigo;

    public Turma(Professor professor, Integer horario,String codigo) {
        this.professor = professor;
        this.horario = horario;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", professor=" + professor +
                ", horario=" + horario +
                ", alunos=" + alunos +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
