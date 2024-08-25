package ExecutionSyst;

import javax.swing.JOptionPane;

import ClasseAluno.Aluno;

public class ExecutavelCode {
	public static void main(String[] args) {
		
		
	String Nome = JOptionPane.showInputDialog("Qual seu Nome? ");
	String idade = JOptionPane.showInputDialog("Qual sua idade");
	String Universidade = JOptionPane.showInputDialog("Qual sua Universidade? ");
    String Matricula = JOptionPane.showInputDialog("Qual sua matricula?");
    String Curso = JOptionPane.showInputDialog("Qual seu curso? ");
    String nota1 = JOptionPane.showInputDialog("Qual foi sua primeira nota do bimestre? ");
    String nota2 = JOptionPane.showInputDialog("Qual foi sua segunda nota do bimestre? ");
    String nota3 = JOptionPane.showInputDialog("Qual foi sua terceira nota do bimestre? ");
    String nota4 = JOptionPane.showInputDialog("Qual foi sua quarta nota do bimestre? ");

    

	Aluno aluno1 = new Aluno();

	aluno1.setNome(Nome);
	aluno1.setIdade(Integer.valueOf(idade));
	aluno1.setUniversidade(Universidade);
	aluno1.setMatricula(Matricula);
	aluno1.setCurso(Curso);
	aluno1.setNota1(Double.parseDouble(nota1));
	aluno1.setNota2(Double.parseDouble(nota2));
	aluno1.setNota3(Double.parseDouble(nota3));
	aluno1.setNota4(Double.parseDouble(nota4));
	aluno1.getMediaFinal();
	aluno1.getResultado2();

	System.out.println("Nome do aluno : " + aluno1.getNome());
	System.out.println("Idade do aluno : "+ aluno1.getIdade());
	System.out.println("Centro de ensino : "+ aluno1.getUniversidade());
	System.out.println("Matricula : " + aluno1.getMatricula());
	System.out.println("Curso : " + aluno1.getCurso());
	System.out.println("Nota 1 : " + aluno1.getNota1());
	System.out.println("Nota 2 : " + aluno1.getNota2());
	System.out.println("Nota 3 : " + aluno1.getNota3());
	System.out.println("Nota 4 : " + aluno1.getNota4());

	
	JOptionPane.showMessageDialog(null, "Sua media final foi :" + aluno1.getMediaFinal());
	JOptionPane.showMessageDialog(null, "Resultado :" + aluno1.getResultado2());

	}
}
