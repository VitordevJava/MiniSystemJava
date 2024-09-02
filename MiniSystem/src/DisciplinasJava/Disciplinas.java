package DisciplinasJava;

import java.util.Objects;

public class Disciplinas {

	private String Disciplinas;
	private double notas;

	public String getDisciplinas() {
		return Disciplinas;
	}

	public void setDisciplinas(String disciplina) {
		Disciplinas = disciplina;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double nota) {
		this.notas = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Disciplinas, notas);
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
		return Objects.equals(Disciplinas, other.Disciplinas)
				&& Double.doubleToLongBits(notas) == Double.doubleToLongBits(other.notas);
	}

	@Override
	public String toString() {
		return "Disciplinas [Disciplina=" + Disciplinas + ", nota=" + notas + "]";
	}

}
