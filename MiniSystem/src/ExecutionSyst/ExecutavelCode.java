package ExecutionSyst;

import javax.swing.JOptionPane;
import ClasseAluno.Aluno;
import DisciplinasJava.Disciplinas;

public class ExecutavelCode {
	public static void main(String[] args) {

		// COLETA DE DADOS DO USUARIO
		String nome = JOptionPane.showInputDialog("Qual seu Nome?");
		String idade = JOptionPane.showInputDialog("Qual sua idade?");
		String universidade = JOptionPane.showInputDialog("Qual sua Universidade?");
		String matricula = JOptionPane.showInputDialog("Qual sua matricula?");
		String curso = JOptionPane.showInputDialog("Qual seu curso?");

		// CONFIGURAÇÃO DO ALUNO
		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setUniversidade(universidade);
		aluno1.setMatricula(matricula);
		aluno1.setCurso(curso);

		// CRIAÇÃO E ADICIONANDO DISCIPLINAS E NOTAS ATRAVES DE UM LOOP 
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina? " + pos + " ");
			String notaDisciplina = JOptionPane.showInputDialog("Qual a nota desta disciplina? " + pos + " ");

			Disciplinas disciplina = new Disciplinas();

			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNotas(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);

		}

		// REMOVER UMA DISCIPLINA DA LISTA

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

		if (escolha == 0) {   // OPÇÃO 0 É "SIM" NA FORMATAÇÃO DO JAVA
			
			int continuarRemover = 0;
			int posiçao = 1;
			
			while (continuarRemover == 0){
				
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover? 1, 2, 3 ou 4? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posiçao);
			posiçao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina?");
			
			}
		}

		// EXIBIÇÃO DOS RESULTADOS
		System.out.println("Disciplinas do aluno:");
		for (Disciplinas disciplina : aluno1.getDisciplinas()) {
			System.out.println(disciplina.getDisciplina() + " - Nota: " + disciplina.getNotas());
		}

		System.out.println("\nInformações do Aluno:");
		System.out.println(aluno1);
		System.out.println("Média Final: " + aluno1.getMediaFinal());
		System.out.println("Resultado Final: " + aluno1.getResultado2());
	}
}
