package ExecutionSyst;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ClasseAluno.Aluno;
import DisciplinasJava.Disciplinas;

public class ExecutavelCode {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        for (int qtd = 1; qtd <= 2; qtd++) {  

            String nome = JOptionPane.showInputDialog("Qual seu Nome?");
            String idade = JOptionPane.showInputDialog("Qual sua idade?");
            String universidade = JOptionPane.showInputDialog("Qual sua Universidade?");
            String matricula = JOptionPane.showInputDialog("Qual sua matricula?");
            String curso = JOptionPane.showInputDialog("Qual seu curso?");

            Aluno aluno1 = new Aluno();
            aluno1.setNome(nome);
            aluno1.setIdade(Integer.parseInt(idade));
            aluno1.setUniversidade(universidade);
            aluno1.setMatricula(matricula);
            aluno1.setCurso(curso);

            for (int pos = 1; pos <= 4; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina? " + pos + " ");
                String notaDisciplina = JOptionPane.showInputDialog("Qual a nota desta disciplina? " + pos + " ");

                Disciplinas disciplina = new Disciplinas();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNotas(Double.valueOf(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
            if (escolha == 0) {
                int continuarRemover = 0;
                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover? 1, 2, 3 ou 4?");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover) - 1);
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina?");
                }
            }
            alunos.add(aluno1);
        }

        for (Aluno aluno : alunos) {
            System.out.println("Disciplinas do aluno: " + aluno.getNome());
            for (Disciplinas disciplina : aluno.getDisciplinas()) {
                System.out.println(disciplina.getDisciplina() + " - Nota: " + disciplina.getNotas());
            }

            System.out.println("\nInformações do Aluno:");
            System.out.println(aluno);
            System.out.println("Média Final: " + aluno.getMediaFinal());
            System.out.println("Resultado Final: " + aluno.getResultado2());
            System.out.println("---------------------------------------------------------------------------------------------");
        }
    }
}
