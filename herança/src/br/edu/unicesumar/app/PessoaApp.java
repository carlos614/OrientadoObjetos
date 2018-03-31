package br.edu.unicesumar.app;

import java.util.Scanner;

import br.edu.unicesumar.control.view.PessoaView;

public class PessoaApp {
	
	public static void main(String[] args) {
		PessoaView view = new PessoaView();
		
		Scanner scan = new Scanner(System.in);
		
		int opcao= 0;
		
		while(opcao !=5){
			
			System.out.println("Selecione uma Opção:");
			System.out.println("1 - Inserir p.fisica");
			System.out.println("2 - inserir p.juridica");
			System.out.println("3- Excluir");
			System.out.println("4- Listar");
			System.out.println("5 - Sair");
			
			opcao = scan.nextInt();
			
			 switch(opcao) {
			 
			 case 1:
				 view.carregarFisica();
				 break;
				 
			 case 2:
				 view.carregarJuridica();
				break;
				 
			 case 3:
				 view.excluirPessoa();
				 break;
				 
			 case 4:
				 view.exibirPessoas();
				 break; 
				 
			 case 5:
				 System.out.println("saindo...");
	 
			 }
		}
		
	}
}
