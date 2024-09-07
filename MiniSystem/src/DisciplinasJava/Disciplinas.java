package DisciplinasJava;

import java.util.Objects;

public class Disciplinas {

    private String disciplina;
    private double notas;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        this.notas = nota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina, notas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disciplinas other = (Disciplinas) obj;
        return Objects.equals(disciplina, other.disciplina)
                && Double.doubleToLongBits(notas) == Double.doubleToLongBits(other.notas);
    }

    @Override
    public String toString() {
        return "Disciplina [Nome=" + disciplina + ", Nota=" + notas + "]";
    }
}
