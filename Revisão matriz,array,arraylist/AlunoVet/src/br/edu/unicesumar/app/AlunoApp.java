package br.edu.unicesumar.app;

import java.util.Scanner;

import br.edu.unicesumar.view.AlunoView;

public class AlunoApp {
	
	public static void main (String[] args) {
		
		AlunoView view = new AlunoView();
		
	Scanner scan = new Scanner(System.in);
	
		int opcao = 0;
		
		while(opcao !=3) {
			
			System.out.println("Selecione uma opcao");
			System.out.println("1 - Inserir Aluno");
			System.out.println("2 - Mostrar em letra maiuscula");
			System.out.println("3 - Listar");
			System.out.println("4 - Sair");
		
			opcao = scan.nextInt();
			
			switch(opcao) {
			
			case 1:
				view.carregarAluno();
				break;
			case 2:
				view.lemaiusculoAluno();
				break;
			case 3:
				view.exibirAluno();
				break;
			case 4:
				System.out.println("Sair....");
				
			
			
			
			
			}	
		}	
	}

}
