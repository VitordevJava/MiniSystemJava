### Sistema de Gerenciamento de Alunos
Este projeto é uma aplicação em Java para gerenciar alunos e suas disciplinas. O sistema permite realizar o cadastro de alunos, inserir suas notas, remover disciplinas ou alunos, e classificar os estudantes com base no desempenho acadêmico. Utiliza uma interface gráfica simples com caixas de diálogo da biblioteca Swing para interação com o usuário.

📋 Funcionalidades
# 1. Login de Acesso
Ao iniciar o programa, o usuário deve fornecer um nome de usuário e senha. O sistema valida o acesso com as credenciais padrão:

Usuário: Admin
Senha: 1234
Caso as credenciais estejam corretas, o acesso é concedido e o programa continua. Caso contrário, o programa é encerrado automaticamente.

# 2. Cadastro de Alunos
O sistema permite cadastrar até 3 alunos. Durante o cadastro, são solicitados os seguintes dados:

Nome: Nome completo do aluno.
Idade: Idade do aluno.
Universidade: Instituição de ensino à qual o aluno pertence.
Matrícula: Número de matrícula do aluno.
Curso: Curso que o aluno está frequentando.
# 3. Gerenciamento de Disciplinas
Para cada aluno, o sistema solicita a inserção de até 4 disciplinas e suas respectivas notas. A nota é inserida como um número decimal, e o programa faz a validação para garantir que a entrada seja numérica.

Inserção de Disciplinas: O usuário deve informar o nome e a nota da disciplina.
Remoção de Disciplinas: Após a inserção, o usuário pode optar por remover disciplinas específicas do aluno.
# 4. Remoção de Alunos
Após o cadastro, o sistema permite que o usuário remova alunos da lista. O usuário pode escolher o aluno por meio de uma interface que lista os alunos cadastrados.

# 5. Classificação dos Alunos
O programa classifica os alunos de acordo com suas notas em três categorias:

Aprovado: Média final igual ou superior a 7.0.
Recuperação: Média final entre 5.0 e 6.9.
Reprovado: Média final inferior a 5.0.
A média final do aluno é calculada com base nas notas inseridas para as disciplinas, e cada aluno é classificado automaticamente ao final do cadastro.

# 6. Exibição de Resultados
Após a classificação, o programa exibe as listas dos alunos aprovados, reprovados e em recuperação, incluindo suas respectivas médias finais.

Exemplo de saída no console:

Lista de Alunos Aprovados:
João - Média: 8.5

Lista de Alunos Reprovados:
Maria - Média: 4.2

Lista de Alunos em Recuperação:
Carlos - Média: 5.8
🛠️ Estrutura do Projeto
O projeto está organizado em pacotes que separam as responsabilidades de cada componente:

Pacotes:
ClasseAluno: Contém a classe Aluno, responsável por armazenar informações pessoais dos alunos e suas disciplinas.

Funções principais:
getMediaFinal(): Calcula e retorna a média final das notas do aluno.
getResultado2(): Retorna o status do aluno (Aprovado, Reprovado, Recuperação) com base na média final.
DisciplinasJava: Contém a classe Disciplinas, que gerencia os dados das disciplinas (nome e nota).

Funções principais:
setDisciplina(String disciplina): Define o nome da disciplina.
setNotas(Double nota): Atribui a nota da disciplina ao aluno.
StaticClass: Contém a classe ClassesStatus, que define os status dos alunos (Aprovado, Reprovado, Recuperação) como constantes.

ExecutionSyst: Contém a classe principal ExecutavelCode, onde ocorre a execução do programa, com fluxo de entrada de dados, validação e classificação de alunos.

Fluxo de Execução:
Login: O sistema pede ao usuário que insira o nome e a senha.
Cadastro de Alunos e Disciplinas: Usuário insere informações dos alunos e suas disciplinas.
Remoção Opcional: Usuário pode remover disciplinas de um aluno ou excluir alunos da lista.
Classificação: O programa classifica os alunos em três categorias (Aprovado, Reprovado, Recuperação) e exibe os resultados no console.
📂 Como Executar
Clone o repositório para sua máquina local:
bash
Copiar código
git clone https://github.com/VitordevJava/sistema-gerenciamento-alunos.git
Abra o projeto em uma IDE como Eclipse, IntelliJ IDEA ou NetBeans.
Compile e execute o arquivo ExecutavelCode.java.
🔧 Requisitos do Sistema
Java 8 ou superior.
JDK instalado.
IDE Java (recomendado: Eclipse, IntelliJ IDEA, ou NetBeans).
🚀 Melhorias Futuras
Persistência de dados: Integração com um banco de dados relacional (MySQL, PostgreSQL) para salvar as informações dos alunos.
Interface Gráfica Avançada: Migrar o sistema para uma interface gráfica mais moderna com JavaFX ou uma aplicação web usando Spring Boot.
Validações adicionais: Implementar mais validações para garantir a integridade dos dados inseridos pelo usuário.
👨‍💻 Autor
Vitor Soares de Carvalho
https://github.com/VitordevJava/
https://www.linkedin.com/in/vitorcrv/
