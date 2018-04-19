package br.edu.unicesumar.control;

import br.edu.unicesumar.Aluno;

public class ControlarAluno {
	
	private Aluno[] listar;
	
	public ControlarAluno() {
		
		listar = new Aluno[5];
		
	}
	
	public void inserir(Aluno a) {
		
		for(int i=0; i<listar.length ; i++) {
			if(listar[i] == null) {
				listar[i] = a;
				break;
			}	
		}
	}
	public void exibir() {
		
		for(int i=0; i<listar.length; i++) {
			
			System.out.println("Sobrenome: "+ listar[i].getSobrenome());
		}
	}
	public void maiusculo() {
		
		for(int i=0; i < listar.length; i++) { 
			if(listar[i] != null){
				listar[i].setNome(listar[i].getNome().toUpperCase());			
				
				System.out.println("Nome: "+listar[i].getNome());
			}
		}
	}

}