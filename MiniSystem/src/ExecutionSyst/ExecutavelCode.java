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
        
      /*  String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1?");
        String nota1 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");
        
        String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2?");
        String nota2 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");
        
        String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3?");
        String nota3 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");
        
        String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4?");
        String nota4 = JOptionPane.showInputDialog("Qual foi sua nota nesta disciplina?");
*/
        
        // CONFIGURAÇÃO DO ALUNO
        Aluno aluno1 = new Aluno();
     
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setUniversidade(universidade);
        aluno1.setMatricula(matricula);
        aluno1.setCurso(curso);
        
        
        Disciplinas disciplina1 = new Disciplinas();
        disciplina1.setDisciplinas("Banco de dados");
        disciplina1.setNotas(90);
        
        aluno1.getDisciplinas().add(disciplina1);
        
        
        Disciplinas disciplina2 = new Disciplinas();
        disciplina1.setDisciplinas("Java web");
        disciplina1.setNotas(90);
        
        aluno1.getDisciplinas().add(disciplina2);
        
        Disciplinas disciplina3 = new Disciplinas();
        disciplina1.setDisciplinas("Redes e computadores");
        disciplina1.setNotas(90);
        
        aluno1.getDisciplinas().add(disciplina3);
        
        Disciplinas disciplina4 = new Disciplinas();
        disciplina1.setDisciplinas("Spring boot MVC");
        disciplina1.setNotas(90);
        
        aluno1.getDisciplinas().add(disciplina4);

        
        // EXIBIÇÃO DOS RESULTADOS 
     
        System.out.println("Media Final: " + aluno1.getMediaFinal());
        System.out.println("Resultado final: " + aluno1.getResultado2());
    }
}
