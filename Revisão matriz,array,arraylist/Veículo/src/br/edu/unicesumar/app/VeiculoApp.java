package br.edu.unicesumar.app;

import java.util.Scanner;
import br.edu.unicesumar.view.VeiculoView;;

public class VeiculoApp {

public static void main (String[] args) {
		
		VeiculoView view = new VeiculoView();
				
				Scanner scan = new Scanner(System.in);
		
		
		int opcao = 0;
		
		while(opcao !=7) {
			
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Inserir Dados do Automovel:");
			System.out.println("2 - Inserir Dados Motocicleta:");
			System.out.println("3 - Inserir Dados do Caminhao:");
			System.out.println("4 - Excluir");
			System.out.println("5 - Listar");
			System.out.println("6 - Pesquisar");
			System.out.println("7 - Sair");
			
				opcao = scan.nextInt();
				
					switch(opcao) {
					
					
					case 1:
						view.carregarAutomovel();
						break;
						
						
					case 2:
						view.carregarMotocicleta();
						break;
						
					case 3:
						view.carregarCaminhao();
						break;
						
					case 4:	
						view.excluirVeiculo();
						break;
						
					case 5:
						view.exibirVeiculo();
						break;
					case 6:
						view.pesquisarVeiculo();
						break;
			
					
			}
		}
	}	
}
