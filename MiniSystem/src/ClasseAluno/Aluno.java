package ClasseAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import DisciplinasJava.Disciplinas;
import StaticClass.ClassesStatus;

public class Aluno {
	private String nome;
	private int idade;
	private String matricula;
	private String universidade;
	private String curso;
	private double mediaFinal;
	private String resultadoFinal;

	private List<Disciplinas> disciplinas = new ArrayList<>();

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getMediaFinal() {
		if (disciplinas.isEmpty()) {
			return 0.0;
		}
		double somaNotas = 0.0;
		for (Disciplinas disciplina : disciplinas) {
			somaNotas += disciplina.getNotas();
		}
		mediaFinal = somaNotas / disciplinas.size();
		return mediaFinal;
	}

	public String getResultado2() {
		if (getMediaFinal() >= 50) {
			if (getMediaFinal() >= 70)
				return ClassesStatus.APROVADO;
			else {
				return ClassesStatus.RECUPERAÇÃO;

			}
		} else {
			return ClassesStatus.REPROVADO;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, matricula, mediaFinal, nome, universidade, idade);
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
		return Objects.equals(curso, other.curso) && Objects.equals(matricula, other.matricula)
				&& Double.doubleToLongBits(mediaFinal) == Double.doubleToLongBits(other.mediaFinal)
				&& Objects.equals(nome, other.nome) && Objects.equals(universidade, other.universidade)
				&& idade == other.idade;
	}

	@Override
	public String toString() {
		return "Aluno [Nome=" + nome + ", Idade=" + idade + ", Matricula=" + matricula + ", Universidade="
				+ universidade + ", Curso=" + curso + ", Média Final=" + mediaFinal + ", Resultado Final="
				+ resultadoFinal + ", Disciplinas=" + disciplinas + "]";
	}
}
