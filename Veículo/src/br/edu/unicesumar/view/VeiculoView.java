package br.edu.unicesumar.view;
import java.util.Scanner;

import br.edu.unicesumar.Automovel;
import br.edu.unicesumar.Caminhao;
import br.edu.unicesumar.Motocicleta;
import br.edu.unicesumar.Veiculo;
import br.edu.unicesumar.control.ControlarVeiculo;

public class VeiculoView {
	
	private ControlarVeiculo control;
	
		public VeiculoView() {
			
			control = new ControlarVeiculo();
			
		}
		
		public void excluirVeiculo() {
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Excluir Ve�culo");
			System.out.println("Renavam: ");
			int renavam = scan.nextInt();
			
			control.excluir(renavam);
		}
		
		public void carregarAutomovel() {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o Renavam do Automovel: ");
			int renavam = scan.nextInt();
			
			System.out.println("Digite a Placa do Automovel: ");
			String placa = scan.nextLine();
			
			System.out.println("Digite o Ano do Automovel: ");
			int ano = scan.nextInt();
			
			System.out.println("Digite a Marca e o Modelo do Automovel: ");
			int marcaEmodelo = scan.nextInt();
			
			System.out.println("Potencia em Cavalos do Automovel: ");
			int cavalos = scan.nextInt();
			
			Veiculo v = new Automovel(renavam,placa,ano,marcaEmodelo,cavalos);
			
			control.inserir(v);
			
			
			
		}
		
		public void carregarMotocicleta() {
			
Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o Renavam da Motocicleta: ");
			int renavam = scan.nextInt();
			
			System.out.println("Digite a Placa da Motocicleta: ");
			String placa = scan.nextLine();
			
			System.out.println("Digite o Ano da Motocicleta: ");
			int ano = scan.nextInt();
			
			System.out.println("Digite a Marca e o Modelo da Motocicleta: ");
			int marcaEmodelo = scan.nextInt();
			
			System.out.println("Potencia em cilindradas da Motocicleta : ");
			int cilindradas = scan.nextInt();
			
			Veiculo v = new Motocicleta(renavam,placa,ano,marcaEmodelo,cilindradas);
			
			control.inserir(v);
			
			
	}
		
		public void carregarCaminhao() {
			
Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o Renavam do Caminhao: ");
			int renavam = scan.nextInt();
			
			System.out.println("Digite a Placa do Caminhao: ");
			String placa = scan.nextLine();
			
			System.out.println("Digite o Ano do Caminhao: ");
			int ano = scan.nextInt();
			
			System.out.println("Digite a Marca e o Modelo do Caminhao: ");
			int marcaEmodelo = scan.nextInt();
			
			System.out.println("Peso total do Caminhao: ");
			int peso = scan.nextInt();
			
			Veiculo v = new Veiculo (renavam,placa,ano,marcaEmodelo,peso);
			
			control.inserir(v);
	}
		
		public void exibirVeiculo() {
			
			control.exibir();
			
		}

}
