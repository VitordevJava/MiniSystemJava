package ExecutionSyst;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ClasseAluno.Aluno;
import DisciplinasJava.Disciplinas;
import StaticClass.ClassesStatus;

public class ExecutavelCode {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();
        List<Aluno> recuperacao = new ArrayList<>();

        for (int qtd = 1; qtd <= 3; qtd++) {

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

        //REMOVER UM ALUNO DA LISTA
        int removerAluno = JOptionPane.showConfirmDialog(null, "Deseja remover algum aluno da lista?");
        if (removerAluno == 0) {  // SE O USUARIO ESCOLHER "SIM"
            int continuarRemoverAluno = 0;
            while (continuarRemoverAluno == 0 && !alunos.isEmpty()) {
                StringBuilder listaAlunos = new StringBuilder("Lista de alunos:\n");
                for (int i = 0; i < alunos.size(); i++) {
                    listaAlunos.append(i + 1).append(". ").append(alunos.get(i).getNome()).append("\n");
                }
                String alunoRemover = JOptionPane.showInputDialog(listaAlunos.toString() + "Qual aluno deseja remover? (Escolha o número)");

                int index = Integer.parseInt(alunoRemover) - 1;
                if (index >= 0 && index < alunos.size()) {
                    alunos.remove(index);
                    JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Número inválido.");
                }

                continuarRemoverAluno = JOptionPane.showConfirmDialog(null, "Deseja remover mais algum aluno?");
            }
        }

        // CLASSIFICAR OS ALUNOS
        for (Aluno aluno : alunos) {
            String resultado = aluno.getResultado2();
            if (resultado.equals(ClassesStatus.APROVADO)) {
                aprovados.add(aluno);
            } else if (resultado.equals(ClassesStatus.REPROVADO)) {
                reprovados.add(aluno);
            } else if (resultado.equals(ClassesStatus.RECUPERAÇÃO)) {
                recuperacao.add(aluno);
            }
        }

        // EXIBIR RESULTADOS CLASSIFICADOS
        System.out.println("Lista de Alunos Aprovados:");
        for (Aluno aluno : aprovados) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.getMediaFinal());
        }

        System.out.println("\nLista de Alunos Reprovados:");
        for (Aluno aluno : reprovados) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.getMediaFinal());
        }

        System.out.println("\nLista de Alunos em Recuperação:");
        for (Aluno aluno : recuperacao) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.getMediaFinal());
        }
        
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
