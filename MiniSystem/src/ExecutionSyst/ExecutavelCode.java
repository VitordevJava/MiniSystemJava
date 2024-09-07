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

        // CRIAÇÃO E ADIÇÃO DAS DISCIPLINAS
        Disciplinas disciplina1 = new Disciplinas();
        disciplina1.setDisciplina("Banco de dados");
        disciplina1.setNotas(90);
        aluno1.getDisciplinas().add(disciplina1);

        Disciplinas disciplina2 = new Disciplinas();
        disciplina2.setDisciplina("Java web");
        disciplina2.setNotas(85);
        aluno1.getDisciplinas().add(disciplina2);

        Disciplinas disciplina3 = new Disciplinas();
        disciplina3.setDisciplina("Redes e computadores");
        disciplina3.setNotas(88);
        aluno1.getDisciplinas().add(disciplina3);

        Disciplinas disciplina4 = new Disciplinas();
        disciplina4.setDisciplina("Spring boot MVC");
        disciplina4.setNotas(92);
        aluno1.getDisciplinas().add(disciplina4);

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
