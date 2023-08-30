package entity;

import jakarta.persistence.*;

@Entity(name = "nota")
@Table(name = "nota")

public class Nota {


    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "turmaid")
    @Column
    private Turma turma;
    @Column
    private double nota;

    public Nota(Turma turma, double nota) {
        this.turma = turma;
        this.nota = nota;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", nota=" + nota +
                '}';
    }
}
