package br.edu.unicesumar.control.view;

import java.util.Scanner;

import br.edu.unicesumar.control.ControlarPessoa;
import br.edu.unicesumar.model.Fisica;
import br.edu.unicesumar.model.Juridica;
import br.edu.unicesumar.model.Pessoa;


public class PessoaView {
	
	private ControlarPessoa control;
			
		public PessoaView() {
			
			control = new ControlarPessoa();
	}
		
		public void excluirPessoa() {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("excluir pessoa");
			System.out.println("Nome: ");
			String nome = scan.nextLine();
			

			control.excluir(nome);
		}
	
public void carregarFisica() {
		
		//Solicitar dados da pessoa
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite Nome Completo: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite Endereço: ");
		String endereco = scan.nextLine();
		
		System.out.println("Digite Telefone: ");
		int telefone = scan.nextInt();
		
		System.out.println("Digite o cpf: ");
		int cpf = scan.nextInt();
		
		System.out.println("Digite o rg: ");
		int rg = scan.nextInt();
		
		Pessoa p = new Fisica(nome,endereco,telefone,cpf,rg);
		
		control.inserir(p);
}



public void carregarJuridica() {
	
	//Solicitar dados da pessoa
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite Nome Completo: ");
	String nome = scan.nextLine();
	
	System.out.println("Digite Endereço: ");
	String endereco = scan.nextLine();
	
	System.out.println("Digite Telefone: ");
	int telefone = scan.nextInt();
	
	System.out.println("Digite CNPJ: ");
	int cnpj = scan.nextInt();
	
	System.out.println("Digite razão social: ");
	String razaoSocial = scan.nextLine();
	
	
	System.out.println("Digite inscrição estadual: ");
	int ie = scan.nextInt();
	
	Pessoa p = new Juridica(nome,endereco,telefone,cnpj,razaoSocial,ie);
	
	control.inserir(p);
	
}
	
	public void exibirPessoas()
	{
		control.exibir();
		
	}
	
	

}

