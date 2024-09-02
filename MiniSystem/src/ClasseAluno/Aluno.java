package ClasseAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import DisciplinasJava.Disciplinas;

public class Aluno {
    String Nome;
    int idade;
    String Matricula;
    String Universidade;
    double MediaFinal;
    String Curso;
    String Resultado2;
    
    private List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
    

    
    public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getNome() {
        return Nome;
    }
    
    public void setNome(String nome) {
        Nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getMatricula() {
        return Matricula;
    }
    
    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
    
    public String getUniversidade() {
        return Universidade;
    }
    
    public void setUniversidade(String universidade) {
        Universidade = universidade;
    }
    
    public String getResultado2() {
        MediaFinal = getMediaFinal();  // Calcular a média final
        if (MediaFinal >= 70) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
    
    public double getMediaFinal() {
        return 0;
    }
    
    public void setMediaFinal(double mediaFinal) {
        MediaFinal = mediaFinal;
    }
    
    public String getCurso() {
        return Curso;
    }
    
    public void setCurso(String curso) {
        Curso = curso;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(Curso, Matricula, MediaFinal, Nome, Universidade, idade);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        return Objects.equals(Curso, other.Curso) && Objects.equals(Matricula, other.Matricula)
                && Double.doubleToLongBits(MediaFinal) == Double.doubleToLongBits(other.MediaFinal)
                && Objects.equals(Nome, other.Nome)
                && Objects.equals(Universidade, other.Universidade) && idade == other.idade;
    }

	@Override
	public String toString() {
		return "Aluno [Nome=" + Nome + ", idade=" + idade + ", Matricula=" + Matricula + ", Universidade="
				+ Universidade + ", MediaFinal=" + MediaFinal + ", Curso=" + Curso + ", disciplinas=" + disciplinas
				+ "]";
	}
    
}
