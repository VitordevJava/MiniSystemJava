package ExecutionSyst;

import javax.swing.JOptionPane;
import ClasseAluno.Aluno;
import DisciplinasJava.Disciplinas;

public class ExecutavelCode {
    public static void main(String[] args) {

        // Coleta de dados do usuário
        String nome = JOptionPane.showInputDialog("Qual seu Nome?");
        String idade = JOptionPane.showInputDialog("Qual sua idade?");
        String universidade = JOptionPane.showInputDialog("Qual sua Universidade?");
        String matricula = JOptionPane.showInputDialog("Qual sua matricula?");
        String curso = JOptionPane.showInputDialog("Qual seu curso?");
        
        String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1?");
        String nota1 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");
        
        String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2?");
        String nota2 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");
        
        String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3?");
        String nota3 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");
        
        String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4?");
        String nota4 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");

        // Configuração do aluno
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setUniversidade(universidade);
        aluno1.setMatricula(matricula);
        aluno1.setCurso(curso);
        
        // Configuração das disciplinas e notas
        Disciplinas disciplinas = aluno1.getDisciplinas();
        disciplinas.setDisciplina1(disciplina1);
        disciplinas.setNota1(Double.parseDouble(nota1));
        
        disciplinas.setDisciplina2(disciplina2);
        disciplinas.setNota2(Double.parseDouble(nota2));
        
        disciplinas.setDisciplina3(disciplina3);
        disciplinas.setNota3(Double.parseDouble(nota3));
        
        disciplinas.setDisciplina4(disciplina4);
        disciplinas.setNota4(Double.parseDouble(nota4));

        // Exibição dos resultados
        System.out.println("Aluno: " + aluno1.toString()); 
        System.out.println("Disciplinas e resultados" + disciplinas.toString());
        System.out.println("Media Final: " + aluno1.getMediaFinal());
        System.out.println("Resultado final: " + aluno1.getResultado2());
    }
}
