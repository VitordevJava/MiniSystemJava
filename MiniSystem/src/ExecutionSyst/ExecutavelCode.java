package ExecutionSyst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import javax.swing.JOptionPane;
import ClasseAluno.Aluno;
import DisciplinasJava.Disciplinas;
import StaticClass.ClassesStatus;

public class ExecutavelCode {

    public static void main(String[] args) {
    	
    	
     
    	String Usuario = JOptionPane.showInputDialog("Qual seu usuario?");
    	String Senha = JOptionPane.showInputDialog("Qual sua senha?");
    	
    	if (Usuario.equalsIgnoreCase("Admin") && Senha.equalsIgnoreCase("1234")) {
    		System.out.println("Acesso permitido");
    		
    	}else {
    		System.out.println("Acesso negado!");
    		 System.exit(0);
    	}
    
    	

        List<Aluno> alunos = new ArrayList<>();
        HashMap<String, List<Aluno>> maps = new HashMap<>();

        // INICIALIZA OS MAPAS PARA AS CLASSIFICAÇÕES
        
        maps.put(ClassesStatus.APROVADO, new ArrayList<Aluno>());
        maps.put(ClassesStatus.RECUPERAÇÃO, new ArrayList<Aluno>());
        maps.put(ClassesStatus.REPROVADO, new ArrayList<Aluno>());

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

                try {
                    Disciplinas disciplina = new Disciplinas();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNotas(Double.parseDouble(notaDisciplina));
                    aluno1.getDisciplinas().add(disciplina);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Nota inválida, por favor insira um número.");
                    pos--;  // REPETIR A ENTRADA PARA ESSA DISCIPLINA
                }
            }

            // REMOVER ALGUMA DISCIPLINA
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
            if (escolha == 0) {
                int continuarRemover = 0;
                while (continuarRemover == 0 && !aluno1.getDisciplinas().isEmpty()) {
                    String disciplinaRemover = JOptionPane
                            .showInputDialog("Qual disciplina deseja remover? 1, 2, 3 ou 4?");
                    try {
                        int indice = Integer.parseInt(disciplinaRemover) - 1;
                        if (indice >= 0 && indice < aluno1.getDisciplinas().size()) {
                            aluno1.getDisciplinas().remove(indice);
                        } else {
                            JOptionPane.showMessageDialog(null, "Disciplina inválida.");
                        }
                    } catch (NumberFormatException | IndexOutOfBoundsException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida.");
                    }
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina?");
                }
            }
            alunos.add(aluno1);
        }

        // REMOVER UM ALUNO
        
        int removerAluno = JOptionPane.showConfirmDialog(null, "Deseja remover algum aluno da lista?");
        if (removerAluno == 0 && !alunos.isEmpty()) {
            int continuarRemoverAluno = 0;
            while (continuarRemoverAluno == 0 && !alunos.isEmpty()) {
                StringBuilder listaAlunos = new StringBuilder("Lista de alunos:\n");
                for (int i = 0; i < alunos.size(); i++) {
                    listaAlunos.append(i + 1).append(". ").append(alunos.get(i).getNome()).append("\n");
                }
                String alunoRemover = JOptionPane
                        .showInputDialog(listaAlunos.toString() + "Qual aluno deseja remover? (Escolha o número)");

                try {
                    int index = Integer.parseInt(alunoRemover) - 1;
                    if (index >= 0 && index < alunos.size()) {
                        alunos.remove(index);
                        JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Número inválido.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida.");
                }

                continuarRemoverAluno = JOptionPane.showConfirmDialog(null, "Deseja remover mais algum aluno?");
            }
        }

        // CLASSIFICAR OS ALUNOS
        
        for (Aluno aluno : alunos) {
            String resultado = aluno.getResultado2();
            if (resultado.equals(ClassesStatus.APROVADO)) {
                maps.get(ClassesStatus.APROVADO).add(aluno);
            } else if (resultado.equals(ClassesStatus.REPROVADO)) {
                maps.get(ClassesStatus.REPROVADO).add(aluno);
            } else if (resultado.equals(ClassesStatus.RECUPERAÇÃO)) {
                maps.get(ClassesStatus.RECUPERAÇÃO).add(aluno);
            }
        }

        // EXIBIR RESULTADOS CLASSIFICADOS
        
        System.out.println("Lista de Alunos Aprovados:");
        for (Aluno aluno : maps.get(ClassesStatus.APROVADO)) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.getMediaFinal());
        }

        System.out.println("\nLista de Alunos Reprovados:");
        for (Aluno aluno : maps.get(ClassesStatus.REPROVADO)) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.getMediaFinal());
        }

        System.out.println("\nLista de Alunos em Recuperação:");
        for (Aluno aluno : maps.get(ClassesStatus.RECUPERAÇÃO)) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.getMediaFinal());
        }

        System.out.println(
                "---------------------------------------------------------------------------------------------");
    }
}
