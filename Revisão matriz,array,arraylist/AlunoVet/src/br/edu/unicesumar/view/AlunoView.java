package br.edu.unicesumar.view;

import java.util.Scanner;
import br.edu.unicesumar.Aluno;
import br.edu.unicesumar.control.ControlarAluno;

public class AlunoView {
	
	private ControlarAluno control;
	
		public AlunoView() {
			
			control = new ControlarAluno();
		}
	public void carregarAluno() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nome  do aluno: ");
		String nome = scan.nextLine();
		
		System.out.println("Sobrenome: ");
		String sobrenome = scan.nextLine();
		
		Aluno a = new Aluno(nome, sobrenome);
		
		control.inserir(a);
		
	}
	
	public void exibirAluno() {
		
		control.exibir();
	}
	public void lemaiusculoAluno() {
		
		control.maiusculo();
	}
}
