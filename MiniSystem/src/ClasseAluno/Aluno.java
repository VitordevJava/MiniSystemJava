package ClasseAluno;

public class Aluno {
	String Nome;
	int idade;
	String Matricula;
	String Universidade;
	String Curso;
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	double Resultado2;
	double MediaFinal;

	public void setResultado2(double resultado2) {
		Resultado2 = resultado2;
	}

	public void setMediaFinal(double mediaFinal) {
		MediaFinal = mediaFinal;
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

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getMediaFinal() {
		return (nota1 + nota2 + nota3 + nota4) / 4;

	}

	/*
	 * public boolean getResultado() { double Media = this.getMediaFinal(); if
	 * (Media >= 70) { return true; } else { return false; } }
	 */
	public String getResultado2() {
		double Media = this.getMediaFinal();
		if (Media >= 70) {
			return "Parabens vc foi aprovado";
		} else {
			return "Uma pena, vc foi reprovado";
		}
	}


}