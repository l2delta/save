package aula_getter_setter;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;
import objetos.Aluno;
import objetos.Disciplina;

public class Main {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno" + qtd + "?");
		/*	String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
			String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
			String rg = JOptionPane.showInputDialog("Registro Geral do aluno?");
			String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
			String mae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
			String pai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
			String matricula = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
			String serie = JOptionPane.showInputDialog("eqa série do aluno?");
			String escola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");*/

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(matricula);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(escola);*/

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3, 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			alunos.add(aluno1);
		}
		// AULA - Criando lista de alunos aprovados, reprovados e em recuperação //
		for (Aluno aluno : alunos) {

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					alunosReprovados.add(aluno);

				}
			}

		}
		System.out.println("---------------Lista dos aprovados----------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
		}
		System.out.println("---------------Lista dos Reprovados----------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
		}
		System.out.println("---------------Lista dos Recuperacao----------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
		}

		// AULA - PERCORRENDO LISTA PELAS POSIÇÕES //

		/*
		 * for (int pos = 0; pos < alunos.size(); pos++) { Aluno aluno =
		 * alunos.get(pos); // AULA - SUBSTITUINDO ALUNO NA LISTA //if
		 * (aluno.getNome().equalsIgnoreCase("alex")) { Aluno trocar = new Aluno();
		 * trocar.setNome("Aluno foi trocado");
		 * 
		 * Disciplina disciplina = new Disciplina();
		 * disciplina.setDisciplina("Matemática"); disciplina.setNota(96);
		 * 
		 * trocar.getDisciplinas().add(disciplina);
		 * 
		 * alunos.set(pos, trocar); aluno = alunos.get(pos); }
		 * 
		 * System.out.println("Aluno = " + aluno.getNome());
		 * System.out.println("Média do aluno = " + aluno.getMediaNota());
		 * System.out.println("Resultado = " + aluno.getAlunoAprovado2());
		 * System.out.println("-----------------------------------------------");
		 * 
		 * for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) { Disciplina
		 * disc = aluno.getDisciplinas().get(posd); System.out.println("Materia = " +
		 * disc.getDisciplina() + "Nota = " + disc.getNota());
		 * 
		 * } } //
		 * -----------------------------------------------------------------------------
		 * ------------------
		 * 
		 *  for (Aluno aluno : alunos) { if (aluno.getNome().equalsIgnoreCase("alex"))
		 * { alunos.remove(aluno); break;
		 * 
		 * } else { System.out.println("Média da nota é = " + aluno.getMediaNota());
		 * System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aprovado" :
		 * "Reprovado")); System.out.println(aluno.toString()); System.out.println(
		 * "**********************************************************"); } } for (Aluno
		 * aluno : alunos) { System.out.println("Alunos que sobraram na lista");
		 * System.out.println(aluno.getNome());
		 * System.out.println("Suas matérias são: ");
		 * 
		 * for (Disciplina disciplina : aluno.getDisciplinas()) {
		 * System.out.println(disciplina.getDisciplina());
		 * 
		 * } }
		 */

	}

}
